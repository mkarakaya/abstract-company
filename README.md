# abstractcompany
Implementation of Abstact Factory and Singleton for learners.


Abstract Factory Example: (Factory of companies)

Introduction:
In this example we have an abstract factory and two real factories (Sony and Apple) which manufacture similar items (Phone and Tablet)
Sony and Apple factories are Singleton objects which inherit abstract factory and create phones and tables. Since each company creates particular phones and tables each of them is asked to create its own product (i.e. Apple is responsible for creating ApplePhone (IPhone) which is an implementation of Phone).
Moreover, this project includes unit tests for each type of products.

Factory Classes:
FactoryMaker: A class to instantiate factory.
AbstractCompanyFactory: An interface to implement AbstractFactory and has two method definition (createPhone, createTablet)
AppleFactory: extends AbstractCompanyFactory for Apple products.
SonyFactory: extends AbstractCompanyFactory for Sony products.

Model Classes:
Phone: An interface for specific Phone implementations of factories.
Tablet: An interface for specific Tablet implementations of factories.
ApplePhone: extends Phone and implements its own characteristic. (returns "IPhone" when getModel method is called.)
AppleTablet: extends Tablet and implements its own characteristic. (returns "IPad" when getModel method is called.)
SonyPhone: extends Phone and implements its own characteristic. (returns "XPeriaPhone" when getModel method is called.)
SonyTablet: extends Tablet and implements its own characteristic. (returns "XPeriaTablet" when getModel method is called.)

Unit test classes:
TestApple: create Apple products.
TestSony: create Sony products.



