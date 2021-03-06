/*
 * generated by Xtext 2.16.0
 */
package nl.utwente.ewi.fmt.uppaalSMC.parser.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractUppaalSMCValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://fmt.ewi.utwente.nl/uppaalSMC"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/uppaal/declarations/1.0.0"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/uppaal/declarations/system/1.0.0"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/uppaal/declarations/global/1.0.0"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/uppaal/templates/1.0.0"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/uppaal/visuals/1.0.0"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/uppaal/types/1.0.0"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/uppaal/statements/1.0.0"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/uppaal/expressions/1.0.0"));
		return result;
	}
}
