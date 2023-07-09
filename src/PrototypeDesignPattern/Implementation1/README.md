So in this implementation, we can see lot of problems -

### **Client1** -

1. Client1 needs to be aware of internals of Student class. Also it needs to be aware of internals of Batch class. 
2. If tomorrow we introduce such private variables in Student class which don't have getter, setter then in that case we won't be able to copy those variables.
3. We will have to write recursive logic for deep copy.

### Client2 -  
1. Client2 is trying to express the limitations with inheritance.
2. It is getting the input from user and depending on that object is created and assigned to s1 reference variable. Hence Client2 would have to use instanceOf to know what object is contained in s1 at runtime. Now depending on the type of object, it will have to write logic. If suppose tomorrow new class gets added, then we will have to create another else if block. So this clearly violates OCP principle. OCP principle says that whenever you are adding new functionality, then we should be able to easily add it without modifying the existing code. 


So how to solve all of these problems? We will address problems 1,2 mentioned under Client1 in Implementation 2.