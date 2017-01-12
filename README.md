[![Build Status](https://travis-ci.org/RawIron/hackerrank-scala.svg)](https://travis-ci.org/RawIron/hackerrank-scala)


## Solved Hackerrank Challenges

It is easy to view and run all the code of the solutions within an IDE like *IntelliJ Idea*.
Simply import the project as a *sbt project*.

There is one file per solved challenge.
The source code files are in the *src/main/scala* folder.
And the tests are in *src/test/scala*.

run with the Scala REPL command.
```
scala < challenge_solution.sc
```

run all tests.
```
sbt test
```

Some of the challenges have a solution written in *Python*.
To keep things simple the source and tests are in the same module.
The module names start with *test_* and the directories are *python packages* (contain an *__init__.py*).
*nosetests* finds and runs the tests.

run all *Python* tests.
```
nosetests3
```


## License

This source code is licensed under the [BSD 2 License](./LICENSE).
