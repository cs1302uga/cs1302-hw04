# cs1302-hw04 More Shapes!

![Approved for: Spring 2025](https://img.shields.io/badge/Approved%20for-Spring%202025-blue)

> 十人十色 (Ten People, Ten Colors)
> **--Japanese Idiom**

This class exercise explores how to utilize inheritance in Java to create new classes
that are directly based on existing ones, with an emphasis on code reuse and design
implications. It also revisits how to commit and view changes to a local Git repository.

## Prerequisite Knowledge

* [CSCI 1302 Inheritance Chapter](https://cs1302uga.github.io/cs1302-book/java/inheritance/inheritance-index.html)
* [CSCI 1302 UML Chapter](https://cs1302uga.github.io/cs1302-book/tools/uml/uml-index.html)

## Course-Specific Learning Outcomes

* **LO3.b:** Create class, interface, method, and inline documentation that satisfies a 
set of requirements.
* **LO3.c:** Generate user-facing API documentation for a software solution.
* **LO4.c:** (Partial) Design, create and use inheritance relationships in a software solution.
* **LO4.d:** Utilize inheritance-based polymorphism in a software solution.

## Questions

In your notes, answer the following questions. These instructions assume that you are 
logged into the Odin server. 

**NOTE:** For each step, please provide in your notes the full command that you typed to make the related 
action happen along with an explanation of why that command worked. Some commands require multiple options. 
It is important to not only recall what you typed but also why you typed each of them. If context is necessary 
(e.g., the command depends on your present working directory), then please note that context as well.
You won't need to submit your notes in your final submission. However, if done properly, your exercise notes 
will serve as a helpful study guide for the exam.

## Exercise Steps

### Checkpoint 1 Steps - Getting Started

1. Use Git to clone the repository for this exercise onto Odin into a subdirectory called `cs1302-hw04`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-hw04.git
   ```

1. Set up your Git username and email on Odin by modifying and executing the commands below. 
   When setting the `user.name` property, please provide your name as it appears on eLC and
   Athena. If you have a preferred name, then you may include it in parentheses. For the
   `user.email` property, please use your `@uga.edu` email address:

   ```
   $ git config --global user.name "Mona Lisa (Liz)"
   $ git config --global user.email "email@uga.edu"
   ```
   
   You can verify that these properties were set correctly by observing the output of
   the following commands:
   
   ```
   $ git config --global user.name
   $ git config --global user.email
   ```

1. Change into the `cs1302-hw04` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```

   You should recognize this code from the inheritance lecture! Refer to your notes from class about
   any inter-dependencies and/or inheritance between the files.
   
   **Please Note:** This homework assignment may be slightly different from what we did in class. 
   Do not make any assumptions about the code based on what was discussed in the lecture.

1. In your notes, draw a complete, proper UML diagram for the three classes contained in the
   starter code. **You might need to devote an entire page to this. We recommend using a pencil.** 
   Refer to the [CSCI 1302 UML Chapter](https://cs1302uga.github.io/cs1302-book/tools/uml/uml-index.html)
   if needed.
   Specifically, each individual class diagram should contain:

   * Class name;
   * Variables;
   * Constructors and methods;
   * If needed, a solid generalization arrow (`extends`) to a parent class; and
   * If needed, a dashed generalization arrow (`implements`) to an interface.

   In a class diagram, do not list inherited members (methods or attributes) unless they are 
   explicitly overridden. Be sure to include visibility modifiers (e.g., `+`, `#`, `~`, `-`) and
   type/return type information where needed. Also, remember that generalization arrows have a triangle
   arrowhead, which differentiates them from dependency and aggregation associations.

<hr/>

![CP](https://img.shields.io/badge/Just%20Finished%20Checkpoint-1-success?style=for-the-badge)

<hr/>

### Checkpoint 2 Steps

1. Create and document a `Rectangle` class in the `cs1302.shapes` package. It should extend
   the `Shape` class. Your `Rectangle` class should include at least:
      * Relevant instance variables for describing a rectangle, 
      * A constructor,
      * A set of overrides for the `getArea` and `getPerimeter` methods, and
      * Getter methods for the instance variables. 

1. Compile your `Rectangle` class. If you encounter any compilation errors:

   1. Write the error down in your notes;
   1. Fix the error in your code;
   1. Recompile; then
   1. Note the fix in your notes.
   1. Repeat as needed.

1. Make sure that all Java files pass the `checkstyle` audit. 
   
1. Since we've added a new class to our project, it's a good idea to save our work using Git.
   In this step, you will do your first commit to your local git repository (on the Odin server) so 
   that you (and the instructors/TAs) can see what you've done. This will create a snapshot of what you've
   done so far. We will use many additional features of git in future
   tutorials and exercises. These features include but are not limited to, creating multiple development 
   branches, rolling back to a previous snapshot (version of the code), and collaborating with teammates.
   
   Check the status of your local copy of the repository using the following command:

   ```
   $ git status
   ```

   You should see a message similar to the following:

   ```
   # On branch master
   # Untracked files:
   #   (use "git add <file>..." to include in what will be committed)
   #
   #	src/cs1302/shapes/Rectangle.java
   nothing added to commit but untracked files present (use "git add" to track)
   ```

   As the message suggests, your `Rectangle.java` file is untracked. This simply means
   that `Rectangle.java` is a new file that is not currently tracked by Git. To add the new
   file to our repository so we can save the changes, use the `git add` command as 
   described in the message. The full command would look something like:
   
   ```
   $ git add src/cs1302/shapes/Rectangle.java
   ```

   Now Git is tracking the `Rectangle.java` file and we can add the changes to our next
   commit snapshot. Execute `git status` again to see the difference in how Git views
   this file after we added it.
   
1. Now, use Git to commit the changes that you made to your source code to your local
   copy of the repository using the command below. Don't forget the string associated 
   with the `-m` (message) option to give a brief, one-sentence description of the 
   changes you made to the source code. Feel free to change the message after `-m` in the
   command below.
   
   ```
   $ git commit -m "Added a Rectangle class to the Shapes hierarchy"
   ```

   <!--
   Removed since we added default editor to the 1302 shell profile:
   
   If you forget the `-m` option, then Git will likely throw you into the Vi program to enter
   a message! 😱 Don't be scared if this happens to you... Press `i`, type your sentence,
   then press the intuitive sequence of keys: `ESC`, `:`, `wq!`, followed by return.
   Next time, remember the `-m` option.
   
   **NOTE:** If you don't want to be inadvertently thrown into Vi in the future, then
   add the following line to your `~/.bash_profile` to set the default editor to Emacs
   (changes take effect on your next login):
   
   ```
   export EDITOR="emacs -nw"
   ```
   -->

1. Generate the API documentation website for all of the code in the `cs1302` package
   into the `doc` directory. You may need to create the `doc` directory if it does not already exist.
   Host the documentation on Odin using `cs1302-hw04-doc` as the name for your symbolic link. Write
   the full URL for the `Rectangle` class in your notes.

<hr/>

![CP](https://img.shields.io/badge/Just%20Finished%20Checkpoint-2-success?style=for-the-badge)

<hr/>

### Checkpoint 3 Steps

1. Create and document a `Square` class in the `cs1302.shapes` package. It should extend
   your `Rectangle` class. You shouldn't need to introduce any new instance variables,
   but you should include a constructor that makes proper use of the `super` keyword.

1. Compile your `Square` class. If you encounter any compilation errors:

   1. Write the error down in your notes;
   1. Fix the error in your code;
   1. Recompile; then
   1. Note the fix in your notes.
   1. Repeat as needed. 

1. Make sure that all Java files pass the `checkstyle` audit. 

1. You just utilized inheritance to reduce the amount of code needed to create a new class! Your
   `Square` class has everything a `Rectangle` has. How much new code did you need to write? 
   Use `wc` to check your code stats! 

   1. How many lines are in `Rectangle.java`?
   1. How many lines are in `Square.java`?
   
   Contrary to popular belief, fewer lines of code is usually better. Also, if you need to make a
   change to a `Rectangle` method, then this change will propagate throughout all descendants
   in your hierarchy that don't explicitly perform an override of the relevant method.

1. Tell Git to track changes made to your `Square.java` file using the `git add` command, then 
   commit the changes to your local copy of the repository. Be sure to include a good log message using
   the `-m` option to the `git commit` command. 

1. Generate the API documentation website for all of the code in the `cs1302` package
   into the `doc` directory. You may need to create the `doc` directory if it does not already exist.
   Host the documentation on Odin using `cs1302-hw04-doc` as the name for your symbolic link. Write
   the full URL for the `Square` class in your notes.

<hr/>

![CP](https://img.shields.io/badge/Just%20Finished%20Checkpoint-3-success?style=for-the-badge)

<hr/>

### Checkpoint 4 Steps

1. Create and document a `ShapeDriver` (driver) class in the `cs1302.shapes` package. Inside of the `main`
   method do the following:

   1. Create a `Shape` array, and populate it with two objects of **each** class (so, 8 total). Something like the
      following (will need to be modified):

      ```java
      Shape[] shapes = new Shape[] {
          new Ellipse(1.1, 2.5), 
          new Circle(1.5)
      };
      ```
      
   1. Loop over the array. For each element in the array, print the name of the shape using the
      `getName` method as well as the return values of the `getArea` and `getPerimeter` methods. Which
      classes do not explicitly define `getArea` and `getPerimeter` in their source code?

1. Make sure that all Java files pass the `checkstyle` audit. 

1. Compile the `ShapeDriver` class and run it. Is the output what you expected?

1. Tell Git to track changes made to your `ShapeDriver.java` file, then commit the changes
   to your local copy of the repository. Be sure to include a good log message. 

1. Regenerate the API documentation website for all of the code in the `cs1302` package.
   What is the direct URL to the API documentation for the class that you wrote
   for this checkpoint?

1. Wonder why we've been having you commit all of these changes to Git? Well, each time you save, you are
   taking a snapshot of your code. Think of it as a save point. Eventually, we will explore the idea of
   going back in time to an older version of the code. Imagine being able to save your code in various stages
   of development. Then, being able to make modifications and have a choice whether to incorporate those changes
   into your code or to discard them! That's just one of the benefits of using Git.

1. To view all of the commits you made in this homework assignment, run the following command:

   ```
   $ git log
   ```
   
   For more concise output, use the following:
   
   ```
   $ git log --all --decorate --oneline --graph
   ```
   
   or just:
   
   ```
   git adog
   ```
   
   for short. Cool, huh? :)
   
<!--

1. If you like the more concise output but think it may become tiresome to write those `git` options out each time, 
   create a `git adog` command by setting up a Git alias:

   ```
   $ git config --global alias.adog "log --all --decorate --oneline --graph"
   ```

1. Now, view the condensed, graphical version of your Git log using `git adog`. That shortcut will
   now be available for you to use anytime you're on Odin!
-->

<hr/>

![CP](https://img.shields.io/badge/Just%20Finished%20Checkpoint-4-success?style=for-the-badge)

<hr/>

### Submission Steps

You will not submit this assignment. However, this is important practice for the first exam. Make sure you understand
the concepts from this homework assignment before the exam date.

<hr/>

![CP](https://img.shields.io/badge/Just%20Finished-Submission-success?style=for-the-badge)

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/) [![License: CC BY-NC 4.0](https://img.shields.io/badge/Instructor%20License-CC%20BY--NC%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Bradley J. Barnes, and the University of Georgia.
This work is licensed under 
a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public and licensed under
a <a rel="license" href="http://creativecommons.org/licenses/by-nc/4.0/">Creative Commons Attribution-NonCommercial 4.0 International License</a> to instructors at institutions of higher education.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
