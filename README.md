# Test Engineering Assessment

This repository is used to assess the proficiency of Test Engineering candidates.  The tests in this repository
are built in java using junit and cucumber.  They contain a large number of "mistakes" or "anti patterns".  The
goal of this repository if for testers to clone the repository and fix the mistakes, answer the questions below
and complete any tasks to demonstrate their ability.  These tasks are meant to mimic the usual day to day tasks
performed by Test Engineers.

## To Complete This Assessment

### For Test Engineers

 - Checkout the code in this repository.  Please make the repository private such that others can't copy your answers.
 - Make changes to the repository to improve (modify/add/delete) the tests, steps, pages, framework and fixing any mistakes.  Consider this to be a real project where these tests are designed to run on a test environment, and potentially later on a pre-prod environment.  All the tests should be completed as if you were working at a real company.
 - Answer the questions asked in this Readme file
 - Complete the tasks which best match your skill level in the task set.


### Required Tasks
- Complete the Purchase feature


### Optional Tasks

TODO put these into groups?  Potentially based on difficulty?  But then this seems to indicate which ones they should do, where as what they select may actually indicate their competencies

- Add screenshotting on each action
- Add screenshotting only on failure
- Add Javascript checking to each page
- Add broken link checking to each page
- Create multiple tests per tag for a test i.e. one for IE and one for Chrome.  Enable different locators for each.
- For specific internet explorer change the way the framework clicks an element to using the selenium action
- Implement screenshot comparison using sikuli
- Create a method to iterate through all iframes to find specific element
- Create a method for a WebElement which regarless of whether it is a checkbox or select box will choose the value input
- Implement a faster Send keys method using javascript - make it such that the first run uses this method and the second uses the normal command
- Add security testing to the framework
- Bring back performance stats for each page load.
- Write a method for waiting for specific javascript events
- Implement localization
- Implement multiple domains
- Write a goto url method or similar which doesn't require http(s)://
- Move how elements are found into a yaml or similar file
- Write a method to find all elements in a select
- Remove logging from the output when running mvn test - i.e. [1586080983.513][SEVERE]: Timed out receiving message from renderer: 0.100
- Enable the tests to be run on a grid or in the cloud with a tool such as sauce labs using parameters in mvn


### Questions

TODO Group these?

- Should and if so how can you include testers that can't code in a test automation project?
- What are the differences in frameworks available to testers?
- Discuss the test pyramid, what are the positives and negatives, when should and shouldn't you follow it?
- How would you start a greensfield test automation project?
- Where should you focus when starting a new project or joining an existing one?
- How long should it take to develop a test, how can you redice this time?
- How can you speed up automated tests?
- What do you think differentiates jnr/int/snr testers/test engineers?
- What question(s) would you ask to determine someones proficiency?
- What else could you add to the framework in this assessment to improve it?
- What else would you do to the tests to improve them?
- How can tests stay up to date during development?
- How can tests be developed in sync with developers building code?
- What is your ideal software testing/development flow?
- What interests you about testing and where to you go to learn more?
- Who are your mentors/who do you learn from?
- What challenges have you faced building tests, how have you overcome them?
- When should you run tests?
- Should you use mocks or real data?
- How should you get data for tests?
- How should you triage broken tests?
- What should be automated?
- How and who should be involved in test automation?  And what should their involvement be?
- How would you debug a test?
- Rank the optional tasks in order of difficulty
- How would you deal with a button with an id such as Login-W123 where the numbers in the id change on each pageload?
- How could the navigation page be better implemented?
- What would you add to this assessment?
- How would you add usability testing to this framework?
- If you were to add a tool which did image comparison to this framework, what would be the benefits, when would you use it, how would you use it, what are the potential downfalls
- Create a set of methods for working with tables and show their usage.

