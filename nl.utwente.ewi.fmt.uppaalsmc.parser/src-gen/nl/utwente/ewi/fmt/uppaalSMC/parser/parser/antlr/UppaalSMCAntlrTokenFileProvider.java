/*
 * generated by Xtext 2.16.0
 */
package nl.utwente.ewi.fmt.uppaalSMC.parser.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UppaalSMCAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("nl/utwente/ewi/fmt/uppaalSMC/parser/parser/antlr/internal/InternalUppaalSMC.tokens");
	}
}