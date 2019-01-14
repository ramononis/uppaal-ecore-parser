# uppaal-ecore-parser
Parsing plain-text UPPAAL files to Ecore models using the UPPAAL meta-model and libutap
## Setup
### Eclipse IDE
Recommended package is [Eclipse Model Tools](https://www.eclipse.org/downloads/packages/).  
Install the following plugins (tested version in parentheses) :
* Xtext Complete SDK (2.16.0.v20181203-1555)
### Repository initialization
Clone the repository with the ```--recurse-submodules``` argument in order to automatically initialize and update each submodule in the repository. Or execute ```git submodule init && git submodule update``` in the repository after cloning normally to achieve the same.
### Importing projects
In Eclipse use "File -> Import -> (General) Existing Projects into Workspace". Select the 'UrPal' directory as the root directory and make sure the option "Search for nested projects" is enabled. Import (at least) the following projects:
* nl.utwente.ewi.fmt.uppaalsmc
* org.muml.uppaal
* org.muml.uppaal.serialization
* org.muml.uppaal.requirements (not necessary, but will resolve errors in org.muml.uppaal.serialization)
