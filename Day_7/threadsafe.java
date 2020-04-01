/*
   Day 7: Thread-Safe ArrayList

   This is a class that acts as a normal
   array, but works with multithreading.
*/
import java.util.ArrayList;
import java.util.concurrent.locks.*;
import java.lang.Thread;

public class threadsafe
{
   public static class ThreadSafeArrayList<T>
   {
      // Default constructor
      public ThreadSafeArrayList()
      {
         arr = new ArrayList();
         lock = new ReentrantLock();
      }
      public ThreadSafeArrayList(T[] array)
      {
         arr = new ArrayList();
         lock = new ReentrantLock();

         // Find the size of the array, if it is greater than 0, initialize
         // the vector to the array.
         if(array.length!=0)
            for(int i = 0; i < array.length;i++)
               push_back(array[i]);
      }

      // These are read-only functions, so we do not need it to be synchronized
      public T at(Integer i){ return arr.get(i); }
      public Integer size(){ return arr.size(); }
      public Boolean empty(){ return arr.isEmpty(); }
      public T front(){ return at(0); }
      public T back(){ return at(size()-1); }

      // Only one thread can add at a time
      void push_back(T elem)
      {
         lock.lock();
         arr.add(elem);
         lock.unlock();
      }
      void pop_back()
      {
         lock.lock();
         arr.remove(size()-1);
         lock.unlock();
      }
      void insert_at(Integer i, T elem)
      {
         lock.lock();
         arr.add(i,elem);
         lock.unlock();
      }
      void erase_at(Integer i)
      {
         lock.lock();
         arr.remove(i);
         lock.unlock();
      }
      void clear()
      {
         lock.lock();
         arr.clear();
         lock.unlock();
      }

      private ArrayList<T> arr;
      private Lock lock;
   }

   public static class addThread implements Runnable
   {
      addThread(ThreadSafeArrayList<Integer> arr, Integer start, Integer end)
      {
         this.arr = arr;
         this.start = start;
         this.end = end;
      }
      public void run()
      {
         for(int i = start; i < end; i++)
            arr.push_back(i);
      }
      private ThreadSafeArrayList<Integer> arr;
      private Integer start;
      private Integer end;
   }

   public static void main(String[] args)
   {
      ThreadSafeArrayList<Integer> arr = new ThreadSafeArrayList<>();
      ArrayList<Thread >threads = new ArrayList();

      // Populate thread safe vector with elements
      for(int i = 0; i < 5; i++)
      {
         threads.add(i,new Thread(new addThread(arr,i*2*1000000,(i+1)*2*1000000)));
         threads.get(i).start();
      }
   }
}
