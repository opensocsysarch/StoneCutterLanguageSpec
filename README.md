# StoneCutter Language Specification

## Introduction
This document serves as the specification behind the 
StoneCutter high level design language.  StoneCutter is designed 
to be a very compact and concise language that permits users to 
define the implementation for a SINGLE instruction.  This alleviates 
the user from manually specifiying redundant items such as I/O 
interfaces, register interfaces and hardware timing.  StoneCutter 
is designed to interface directly with the remainder of the System 
Architect and CoreGen infrastructure.  The output of compiling 
one or more StoneCutter instruction definitions is an equivalent 
Chisel representation of the circuit that is directly integrated 
with the remainder of the System Architect design flow.  This can 
be further compiled down to a Verilog representation of the target 
design.  

This document serves a full language specification.  It does 
not outline any of the associated tools and interfaces utilized 
within the System Architect design flow.  

## Getting Started
Building the specification document requires LaTeX.  The easiest way to build 
the document from source is to utilize the included makefile.

## Contributing
There are two types of contributions for the StoneCutter Language Spec.

1. **Bug Fixes** : These contributions are in the form of bug fixes for 
grammatical, spelling for generall formatting errors.  Further, these contributions 
can be clarifying text for a given version of the spec.  However, bug fixes **WILL NOT**
modify the structure of the language.  Submit all bug fix contributions as pull requests.
1. **Language Extensions** : Language Extensions are updates or extensions to the structure of the 
StoneCutter language.  These contributions must be reviewed for the CoreGen 
development community and sufficient testing must occur in the StoneCutter compiler 
prior to these items being accpted.  Please note that language extension contributions 
must **ALWAYS** be accompanied by adjacent compiler updates and their 
associated tests.  No exceptions will be made to this rule.  Any language extension 
pull requests that do not have adjacent pull requests in the CoreGen StoneCutter tree will 
be ignored or removed.

## License
The StoneCutter Language Spec is licensed under an Apache-style license - see the [LICENSE](LICENSE) file for details

## Authors
* *John Leidel** - *Chief Scientist* - [Tactical Computing Labs](http://www.tactcomplabs.com)

## Acknowledgments
* None at this time
