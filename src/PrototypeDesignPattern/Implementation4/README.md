Now here problem to copy private variables of superclass is solved now. Other than this, there is one reform we can do here.
As we know behaviour of object is represented by its class methods. Now copy() is not contributing to behavior of Student class, so can we put the copy() in the interface?
Yes we should do that because multiple classes can have the need to have copy() and in that case they can implement this interface.