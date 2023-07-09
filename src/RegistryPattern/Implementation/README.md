Registry pattern is an extension of prototype pattern only. It says that if we have multiple 
prototypes and among those prototypes we need to decide which one to use to create the copy. Let's say we decided that and now we want to get that prototype object, so for that we use registry.
Registry is nothing but a container and in case of registry pattern, it contains multiple prototype objects.

Even Spring boot has something called as "**AppContext**", this is basically a registry and it stores beans/object by some key. AppContext is initialized at the start of application itself. Later on if we need one of these beans, then we can get it from AppContext. Generally registry object is created only once, hence it's a singleton class.