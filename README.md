# StoneCutter Language Specification

## Introduction
This document serves as the specification behind the CoreGen 
Intermediate Representation (IR).  The CoreGen IR is formatted 
as human-readable YAML (YAML Ain't a Markup Language) text such that 
tools outside the CoreGen/System Architect ecosystem have the ability 
to read and interpret the IR.  Further, it is entirely possible to 
manually construct an IR file using a simple text editor.  Pay special 
attention to the version structure of the IR Spec.  Future versions 
of the System Architect/CoreGen tools may utilize newer versions of the 
spec.  While we make every effort to remain backward compatible, there 
may be certain idiosyncratic discrepancies.  

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
