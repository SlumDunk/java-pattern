## day 01
    six Principles:
        Single responsibility principle (SRP)
            A class is only responsible for one responsibility
            
        Open closed principle (OCP)    
            Open to extension, closed to modification
            For the entire project structure, Macro Level
            
            
        Liskov Substitution Principle (LSP)
            Subclasses can extend the functions of the parent class, but do not change the original functions of the 
            parent class
            
        Dependency Inversion Principle (DIP)
            abstraction should not depend on details. Details should depend on abstraction. In other words, it’s about 
            interface, not implementation programming.
            
            
        Interface Segregation Principle (ISP)
            Set the interface function as fine-grained as possible, the smallest functional unit
                        
        Law of Demeter (LOD)
            Reduce coupling, do not include new classes in local variables
            
            
    Simple Factory Pattern
    
    Factory Method Pattern
    
    Abstract Fatactory Pattern
        combine two or more type of factories into one factory
        
    Builder Pattern
    
    Single Instance Pattern
    
    
    ###                    
    Adapter Pattern
        have products firstly, then have adapters to solve problems 
        combination is better than inheritance

    Bridge Pattern
        have bridge firstly, then have products
        target is to separate attributes
        Combining functions that change in two dimensions for independent change                
    
    Decoration Pattern
        Function enforcement
    
    Proxy Pattern
        
    Combination Pattern
        Treat a group of similar objects as a single object in order to reduce the data type
        
    Facade Pattern      
        Combine functions of different progress, providing only one entrance to the outside world
        
    ###        
    Template Method Pattern            
        Define the main progress in Parent class, and let the Child class implements the concrete business
        
    Strategy Pattern (Spring IOC idea)
        Inject Object, change behavior                                  
    
    Chain of Responsibility Pattern
        when there are multiple objects handle one request, use this pattern
        Filter            
         
    Observation Pattern
    
    Command Pattern
        add Command class, convert the Non-abstract Programming to Abstract Programming
        
    Visitor Pattern
        Using the double dispatch mechanism to make up for shortcoming of method overloading--it is static      