**SOLID principles are five design guidelines that help developers create software that is easy to maintain, scale, and understand. 
They were popularized by Robert C. Martin ("Uncle Bob").**

**1. Single Responsibility Principle (SRP)**
"A class should have only one reason to change."

A class should do one thing and do it well. If a class handles database logic, UI logic, and business logic, changing the database schema might break the UI.

Bad: An Invoice class that calculates totals and saves the invoice to a database.

Good: An Invoice class for calculations and an InvoiceRepository class for database operations.

**2. Open/Closed Principle (OCP)**
"Software entities should be open for extension, but closed for modification."

You should be able to add new functionality without changing existing code. We achieve this using Interfaces or Abstract Classes.

Example: If you have a Discount class, don't use if-else to check for "VIP" or "Student" discounts. Instead, create a Discount interface and let VIPDiscount and StudentDiscount implement it.

**3. Liskov Substitution Principle (LSP)**
"Objects of a superclass should be replaceable with objects of its subclasses without breaking the application."

A subclass should never break the logic of the parent class.

Classic Violation: A Bird class has a fly() method. If you create an Ostrich subclass, it cannot fly. If you substitute Bird with Ostrich in code that expects flying, the program fails.

Fix: Separate behaviors into interfaces like Flyable and Walkable.

**4. Interface Segregation Principle (ISP)**
"A client should never be forced to depend on methods it does not use."

It is better to have many small, specific interfaces than one large, "fat" interface.

Bad: A SmartDevice interface with print(), fax(), and scan(). If a simple Printer implements this, it's forced to provide empty implementations for fax() and scan().

Good: Create IPrinter, IFax, and IScanner interfaces.

**5. Dependency Inversion Principle (DIP)**
"Depend on abstractions, not concretions."

High-level modules should not depend on low-level modules. Both should depend on interfaces.

Example: A Switch should not be hard-coded to a LightBulb. Instead, the Switch should depend on a Powerable interface. This way, the Switch can turn on a LightBulb, a Fan, or a Radio without changing its own code.
