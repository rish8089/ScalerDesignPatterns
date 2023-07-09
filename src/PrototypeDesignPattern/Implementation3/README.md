So in this, problems of Client2 also got solved because now on the basis of the object assigned to s1 reference variable, copy function would get called. 
If s1 reference variable holds Student object, then Student's copy function would get called and if it holds IntelligentStudent object, then IntelligentStudent's copy function would get called.

But two more problems have emerged - 
1. private variable of super class like in this case ('counter' variable in Student class) is not getting copied.
2. When creating or implementing child classes, one should implement copy function. If a developer misses it, then it would lead to incorrect copy.  


2nd problem we have to live with, there is no solution till now for that. 1st problem we will solve in Implementation 4.
By the way this is called prototype pattern and according to it, responsibility of creating a copy of object should lie with the object itself. It comes with the note of caution that copy() should be overridden by child classes otherwise you might get incorrect results.
Here prototype means 'reference' or 'sample' or 'proof of concept' or 'template'.