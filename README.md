# GroupHW7

Describe any problems your group had writing the code

- We had some difficulties in the start figuring out what needed to be changed (and walking through the code). This was easily resolved by talking through the logic steps, and looking at the various examples from previous examples.

Did you change the classes that were tested?  Why or why not?

- Yes, we did change the classes that were tested. We had to change the names of the methods because each animal had a different unique method name for each. We changed this so that the children classes matched and overrode the parent class methods. We also changed the Unit Test class so that it ran thorugh one if statement to test any animal instead of walking through each individual animal.


Did you change the classes that were tested?  Why or why not?
- Yes, we did change the classes that were tested. We had to change the names of the methods because each animal had a different unique method name for each. We changed this so that the children classes matched and overrode the parent class methods. We also changed the Unit Test class so that it ran thorugh one if statement to test any animal instead of walking through each individual animal.

Describe your team's solution.  Explain how it meets the criteria given.
- We have an abstract parent class that is then implemented by each 'child' animal class. The test class doesn't need to be edited to add on additional animals- you can just do that by creating a class with the correct methods.

Do you think unit testing is important? Why or why not?

- Yes, as it helps resolve bugs/types on your code that can caush crashes/problems at a later time. Its also a quick easy way to validate your code on a team, or check someone elses code works.

Name 3 key parts of the Observer pattern

- 3 key parts of the Observer pattern are:
  
  - The ability to create (register) and get rid of (unregister) an obersver object.
  - The ability or method to notify the observer if there has been any change.
  - The ability to listen or "observe" an object and recieve updates to be able to notify of changes.


When would you use the Observer pattern?  What problem does it solve?

- I would say that you would use the Observer pattern if you have many dependent relationships where there needs to be a notofication of any changes made. For example, you could use the Observer pattern if you have a class that is dependent on another class and needs to be notified of any changes because it is dependent on that class and these changes would directly impact it.

Name 3 key parts of the Strategy pattern

- 3 key parts of the Strategy Pattern are:
  
  - Alternative option to subclassing as stated in the JavaPoint tutorial https://www.javatpoint.com/strategy-pattern
  - Allows for the decision of which algorithm to use at runtime instead of hardcoding the decision
  - Easier to add new behaviors and classes without changing already tested and implemented code
  
When would you use the Strategy pattern?  What problem does it solve?
  - You would use the strategy pattern when you have similar class structures with different algorithms that need to be implemented. For example, if you had different mathematical operations that need to be performed on two numbers, you could create a parent operation class and then child classes that implement the specific operations (addition, subtraction etc.).
