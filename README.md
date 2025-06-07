## A collection of design-patterns, implemented in Java.

## Flyweight Design Pattern
The Flyweight Design Pattern is a structural design pattern that helps reduce memory usage by sharing as much data as possible with similar objects. It's especially useful when working with a large number of objects that have many shared attributes.

### Key Idea
- Separate intrinsic state (shared and reusable data) from extrinsic state (context-specific data).
- Store intrinsic state in a shared object (the Flyweight).
- Extrinsic state is passed by the client when needed.

### When to Use It
- You need to create a large number of similar objects.
- Most of the object's data can be shared.
- Object instantiation is expensive or consumes a lot of memory.