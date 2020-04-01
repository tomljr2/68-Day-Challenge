/*
   Day 7: Thread-Safe Vector

   This is a class that acts as a normal
   array, but works with multithreading.

   Compile with:
   g++ -std=c++11 -pthread threadsafe.cpp
*/
#include <iostream>
#include <mutex>
#include <vector>
#include <thread>
#include <functional>
using namespace std;

template <class T>
class ThreadSafeVector
{
   public:
      // Default constructor
      ThreadSafeVector(){}

      ThreadSafeVector(T array[])
      {
         // Find the size of the array, if it is greater than 0, initialize
         // the vector to the array.
         int n = sizeof(array) == 0 ? 0 : sizeof(array)/sizeof(array[0]);
         if(n!=0)
            for(int i = 0; i < n; i++)
               push_back(array[i]);
      }

      // These are read-only functions, so we do not need it to be synchronized
      T at(int i){ return vect[i]; }
      T &operator[](int i){ return vect[i]; }
      int size(){ return vect.size(); }
      int max_size(){ return vect.max_size(); }
      bool empty(){ return vect.empty(); }
      T front(){ return vect.front(); }
      T back(){ return vect.back(); }

      // Only one thread can add at a time
      void push_back(T elem)
      {
         lock.lock();
         vect.push_back(elem);
         lock.unlock();
      }
      void pop_back()
      {
         lock.lock();
         vect.pop_back();
         lock.unlock();
      }
      void insert_at(int i, T elem)
      {
         lock.lock();
         vect.insert(vect.begin()+i,elem);
         lock.unlock();
      }
      void erase_at(int i)
      {
         lock.lock();
         vect.erase(vect.begin()+i);
         lock.unlock();
      }
      void clear()
      {
         lock.lock();
         vect.clear();
         lock.unlock();
      }

   private:
      vector<T> vect;
      mutex lock;
};

void addObjectsInRange(ThreadSafeVector<int>& vect, int start, int end)
{
   for(int i = start; i < end; i++)
      vect.push_back(i);
}

int main()
{
   ThreadSafeVector<int> vect;
   vector <thread> threads;

   // Populate thread safe vector with elements
   for(int i = 0; i < 5; i++)
      threads.push_back(thread(addObjectsInRange,ref(vect),i*2*1000000,(i+1)*2*1000000));
   for(int i = 0; i < 5; i++)
      threads[i].join();
   return 0;
}
