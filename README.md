# Rule 90

An implementation of the [Rule 90](https://en.wikipedia.org/wiki/Special:Search?search=rule%2090&go=Go) cellular automaton.

## Installation

1. Install [Kotlin 1.3](https://kotlinlang.org/docs/tutorials/command-line.html)
1. Clone the repository using one of the following methods.
    - SSH: `git clone git@github.com:neelkamath/rule-90.git`
    - HTTPS: `git clone https://github.com/neelkamath/rule-90.git`
1. `cd rule-90`
1. Compile: `kotlinc Main.kt -include-runtime -d main.jar`

## Usage

`java -jar main.jar <CELLS>`, where `<CELLS>` is an integer greater than 1 denoting the number of cells the initial randomly generated array should contain

## License

This project is under the [MIT License](LICENSE).