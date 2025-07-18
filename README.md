## A collection of design-patterns, implemented in Java.

## Flyweight Design Pattern
The Flyweight Design Pattern is a structural design pattern that helps reduce memory usage by sharing as much data as possible with similar objects. It's especially useful when working with a large number of objects that have many shared attributes.

- Separate intrinsic state (shared and reusable data) from extrinsic state (context-specific data).
- Store intrinsic state in a shared object (the Flyweight).
- Extrinsic state is passed by the client when needed.

### When to Use It
- You need to create a large number of similar objects.
- Most of the object's data can be shared.
- Object instantiation is expensive or consumes a lot of memory.

## Memento Design Pattern
The Memento Design Pattern is a behavioral design pattern used to capture and externalize an object's internal state so that the object can be restored to this state later, without violating encapsulation.

### Key Components

### Originator
The object whose state needs to be saved and restored.
Has methods to create and restore mementos.

### Memento
A value object that stores the internal state of the Originator.
Should be opaque to other objects (i.e., no external access to its contents except by the Originator).

### Caretaker
Manages the memento's storage.
Keeps track of saved states but doesn't modify or inspect the contents.