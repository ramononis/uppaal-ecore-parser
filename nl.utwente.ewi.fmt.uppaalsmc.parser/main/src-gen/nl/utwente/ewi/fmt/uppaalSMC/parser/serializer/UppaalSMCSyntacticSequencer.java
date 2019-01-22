/*
 * generated by Xtext 2.16.0
 */
package nl.utwente.ewi.fmt.uppaalSMC.parser.serializer;

import com.google.inject.Inject;
import java.util.List;
import nl.utwente.ewi.fmt.uppaalSMC.parser.services.UppaalSMCGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class UppaalSMCSyntacticSequencer extends AbstractSyntacticSequencer {

	protected UppaalSMCGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CEdge_XmlAttributeParserRuleCall_3_2_a;
	protected AbstractElementAlias match_CEdge_XmlAttributeParserRuleCall_4_2_a;
	protected AbstractElementAlias match_CEdge_XmlAttributeParserRuleCall_5_2_a;
	protected AbstractElementAlias match_CEdge_XmlAttributeParserRuleCall_6_2_a;
	protected AbstractElementAlias match_CEdge_XmlAttributeParserRuleCall_7_2_a;
	protected AbstractElementAlias match_ELocation_XmlAttributeParserRuleCall_1_1_a;
	protected AbstractElementAlias match_ELocation_XmlAttributeParserRuleCall_2_2_a;
	protected AbstractElementAlias match_ELocation_XmlAttributeParserRuleCall_5_a;
	protected AbstractElementAlias match_NEdge_XmlAttributeParserRuleCall_3_2_a;
	protected AbstractElementAlias match_NEdge_XmlAttributeParserRuleCall_4_2_a;
	protected AbstractElementAlias match_NEdge_XmlAttributeParserRuleCall_5_2_a;
	protected AbstractElementAlias match_NEdge_XmlAttributeParserRuleCall_6_2_a;
	protected AbstractElementAlias match_NLocation_XmlAttributeParserRuleCall_1_1_a;
	protected AbstractElementAlias match_NLocation_XmlAttributeParserRuleCall_2_2_a;
	protected AbstractElementAlias match_NSTA_QUERIESTerminalRuleCall_17_q;
	protected AbstractElementAlias match_NegationExpression_ExclamationMarkKeyword_0_0_or_NotKeyword_0_1;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_2_0_p;
	protected AbstractElementAlias match_RedefinedTemplate_ColonEqualsSignKeyword_2_0_or_EqualsSignKeyword_2_1;
	protected AbstractElementAlias match_Template_XmlAttributeParserRuleCall_2_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (UppaalSMCGrammarAccess) access;
		match_CEdge_XmlAttributeParserRuleCall_3_2_a = new TokenAlias(true, true, grammarAccess.getCEdgeAccess().getXmlAttributeParserRuleCall_3_2());
		match_CEdge_XmlAttributeParserRuleCall_4_2_a = new TokenAlias(true, true, grammarAccess.getCEdgeAccess().getXmlAttributeParserRuleCall_4_2());
		match_CEdge_XmlAttributeParserRuleCall_5_2_a = new TokenAlias(true, true, grammarAccess.getCEdgeAccess().getXmlAttributeParserRuleCall_5_2());
		match_CEdge_XmlAttributeParserRuleCall_6_2_a = new TokenAlias(true, true, grammarAccess.getCEdgeAccess().getXmlAttributeParserRuleCall_6_2());
		match_CEdge_XmlAttributeParserRuleCall_7_2_a = new TokenAlias(true, true, grammarAccess.getCEdgeAccess().getXmlAttributeParserRuleCall_7_2());
		match_ELocation_XmlAttributeParserRuleCall_1_1_a = new TokenAlias(true, true, grammarAccess.getELocationAccess().getXmlAttributeParserRuleCall_1_1());
		match_ELocation_XmlAttributeParserRuleCall_2_2_a = new TokenAlias(true, true, grammarAccess.getELocationAccess().getXmlAttributeParserRuleCall_2_2());
		match_ELocation_XmlAttributeParserRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getELocationAccess().getXmlAttributeParserRuleCall_5());
		match_NEdge_XmlAttributeParserRuleCall_3_2_a = new TokenAlias(true, true, grammarAccess.getNEdgeAccess().getXmlAttributeParserRuleCall_3_2());
		match_NEdge_XmlAttributeParserRuleCall_4_2_a = new TokenAlias(true, true, grammarAccess.getNEdgeAccess().getXmlAttributeParserRuleCall_4_2());
		match_NEdge_XmlAttributeParserRuleCall_5_2_a = new TokenAlias(true, true, grammarAccess.getNEdgeAccess().getXmlAttributeParserRuleCall_5_2());
		match_NEdge_XmlAttributeParserRuleCall_6_2_a = new TokenAlias(true, true, grammarAccess.getNEdgeAccess().getXmlAttributeParserRuleCall_6_2());
		match_NLocation_XmlAttributeParserRuleCall_1_1_a = new TokenAlias(true, true, grammarAccess.getNLocationAccess().getXmlAttributeParserRuleCall_1_1());
		match_NLocation_XmlAttributeParserRuleCall_2_2_a = new TokenAlias(true, true, grammarAccess.getNLocationAccess().getXmlAttributeParserRuleCall_2_2());
		match_NSTA_QUERIESTerminalRuleCall_17_q = new TokenAlias(false, true, grammarAccess.getNSTAAccess().getQUERIESTerminalRuleCall_17());
		match_NegationExpression_ExclamationMarkKeyword_0_0_or_NotKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNegationExpressionAccess().getExclamationMarkKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getNegationExpressionAccess().getNotKeyword_0_1()));
		match_PrimaryExpression_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
		match_PrimaryExpression_LeftParenthesisKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
		match_RedefinedTemplate_ColonEqualsSignKeyword_2_0_or_EqualsSignKeyword_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRedefinedTemplateAccess().getColonEqualsSignKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getRedefinedTemplateAccess().getEqualsSignKeyword_2_1()));
		match_Template_XmlAttributeParserRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getTemplateAccess().getXmlAttributeParserRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getCHANRule())
			return getCHANToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getQUERIESRule())
			return getQUERIESToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getXmlAttributeRule())
			return getXmlAttributeToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal CHAN : "chan";
	 */
	protected String getCHANToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "chan";
	}
	
	/**
	 * terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal QUERIES	: '<queries>' -> '</queries>';
	 */
	protected String getQUERIESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<queries>";
	}
	
	/**
	 * @Override
	 * terminal STRING	: '"' ( '\\' .  | !('\\'|'"') )* '"';
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * XmlAttribute:
	 * 	ID ('=' STRING)?;
	 */
	protected String getXmlAttributeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_CEdge_XmlAttributeParserRuleCall_3_2_a.equals(syntax))
				emit_CEdge_XmlAttributeParserRuleCall_3_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CEdge_XmlAttributeParserRuleCall_4_2_a.equals(syntax))
				emit_CEdge_XmlAttributeParserRuleCall_4_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CEdge_XmlAttributeParserRuleCall_5_2_a.equals(syntax))
				emit_CEdge_XmlAttributeParserRuleCall_5_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CEdge_XmlAttributeParserRuleCall_6_2_a.equals(syntax))
				emit_CEdge_XmlAttributeParserRuleCall_6_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CEdge_XmlAttributeParserRuleCall_7_2_a.equals(syntax))
				emit_CEdge_XmlAttributeParserRuleCall_7_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ELocation_XmlAttributeParserRuleCall_1_1_a.equals(syntax))
				emit_ELocation_XmlAttributeParserRuleCall_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ELocation_XmlAttributeParserRuleCall_2_2_a.equals(syntax))
				emit_ELocation_XmlAttributeParserRuleCall_2_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ELocation_XmlAttributeParserRuleCall_5_a.equals(syntax))
				emit_ELocation_XmlAttributeParserRuleCall_5_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NEdge_XmlAttributeParserRuleCall_3_2_a.equals(syntax))
				emit_NEdge_XmlAttributeParserRuleCall_3_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NEdge_XmlAttributeParserRuleCall_4_2_a.equals(syntax))
				emit_NEdge_XmlAttributeParserRuleCall_4_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NEdge_XmlAttributeParserRuleCall_5_2_a.equals(syntax))
				emit_NEdge_XmlAttributeParserRuleCall_5_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NEdge_XmlAttributeParserRuleCall_6_2_a.equals(syntax))
				emit_NEdge_XmlAttributeParserRuleCall_6_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NLocation_XmlAttributeParserRuleCall_1_1_a.equals(syntax))
				emit_NLocation_XmlAttributeParserRuleCall_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NLocation_XmlAttributeParserRuleCall_2_2_a.equals(syntax))
				emit_NLocation_XmlAttributeParserRuleCall_2_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NSTA_QUERIESTerminalRuleCall_17_q.equals(syntax))
				emit_NSTA_QUERIESTerminalRuleCall_17_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NegationExpression_ExclamationMarkKeyword_0_0_or_NotKeyword_0_1.equals(syntax))
				emit_NegationExpression_ExclamationMarkKeyword_0_0_or_NotKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LeftParenthesisKeyword_2_0_p.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RedefinedTemplate_ColonEqualsSignKeyword_2_0_or_EqualsSignKeyword_2_1.equals(syntax))
				emit_RedefinedTemplate_ColonEqualsSignKeyword_2_0_or_EqualsSignKeyword_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Template_XmlAttributeParserRuleCall_2_a.equals(syntax))
				emit_Template_XmlAttributeParserRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     target=[Location|STRING] '/>' '<label' 'kind="select"' (ambiguity) '>' selection+=Selection
	 */
	protected void emit_CEdge_XmlAttributeParserRuleCall_3_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     selection+=Selection '</label>' '<label' 'kind="guard"' (ambiguity) '>' guard=Expression
	 *     target=[Location|STRING] '/>' '<label' 'kind="guard"' (ambiguity) '>' guard=Expression
	 */
	protected void emit_CEdge_XmlAttributeParserRuleCall_4_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     guard=Expression '</label>' '<label' 'kind="synchronisation"' (ambiguity) '>' synchronization=Synchronization
	 *     selection+=Selection '</label>' '<label' 'kind="synchronisation"' (ambiguity) '>' synchronization=Synchronization
	 *     target=[Location|STRING] '/>' '<label' 'kind="synchronisation"' (ambiguity) '>' synchronization=Synchronization
	 */
	protected void emit_CEdge_XmlAttributeParserRuleCall_5_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     guard=Expression '</label>' '<label' 'kind="assignment"' (ambiguity) '>' update+=Expression
	 *     selection+=Selection '</label>' '<label' 'kind="assignment"' (ambiguity) '>' update+=Expression
	 *     synchronization=Synchronization '</label>' '<label' 'kind="assignment"' (ambiguity) '>' update+=Expression
	 *     target=[Location|STRING] '/>' '<label' 'kind="assignment"' (ambiguity) '>' update+=Expression
	 */
	protected void emit_CEdge_XmlAttributeParserRuleCall_6_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     guard=Expression '</label>' '<label' 'kind="probability"' (ambiguity) '>' weight=Expression
	 *     selection+=Selection '</label>' '<label' 'kind="probability"' (ambiguity) '>' weight=Expression
	 *     synchronization=Synchronization '</label>' '<label' 'kind="probability"' (ambiguity) '>' weight=Expression
	 *     target=[Location|STRING] '/>' '<label' 'kind="probability"' (ambiguity) '>' weight=Expression
	 *     update+=Expression '</label>' '<label' 'kind="probability"' (ambiguity) '>' weight=Expression
	 */
	protected void emit_CEdge_XmlAttributeParserRuleCall_7_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     color=ColorKind '>' '<name' (ambiguity) '>' comment=ID
	 *     colorCode=STRING '>' '<name' (ambiguity) '>' comment=ID
	 *     name=STRING '>' '<name' (ambiguity) '>' comment=ID
	 *     position=Point '>' '<name' (ambiguity) '>' comment=ID
	 */
	protected void emit_ELocation_XmlAttributeParserRuleCall_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     color=ColorKind '>' '<label' 'kind="invariant"' (ambiguity) '>' invariant=Expression
	 *     colorCode=STRING '>' '<label' 'kind="invariant"' (ambiguity) '>' invariant=Expression
	 *     comment=ID '</name>' '<label' 'kind="invariant"' (ambiguity) '>' invariant=Expression
	 *     name=STRING '>' '<label' 'kind="invariant"' (ambiguity) '>' invariant=Expression
	 *     position=Point '>' '<label' 'kind="invariant"' (ambiguity) '>' invariant=Expression
	 */
	protected void emit_ELocation_XmlAttributeParserRuleCall_2_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     color=ColorKind '>' '<label' 'kind="exponentialrate"' (ambiguity) '>' exitRate=Expression
	 *     color=ColorKind '>' '<label' 'kind="exponentialrate"' (ambiguity) '>' exitRate=RatioExpression
	 *     colorCode=STRING '>' '<label' 'kind="exponentialrate"' (ambiguity) '>' exitRate=Expression
	 *     colorCode=STRING '>' '<label' 'kind="exponentialrate"' (ambiguity) '>' exitRate=RatioExpression
	 *     comment=ID '</name>' '<label' 'kind="exponentialrate"' (ambiguity) '>' exitRate=Expression
	 *     comment=ID '</name>' '<label' 'kind="exponentialrate"' (ambiguity) '>' exitRate=RatioExpression
	 *     invariant=Expression '</label>' '<label' 'kind="exponentialrate"' (ambiguity) '>' exitRate=Expression
	 *     invariant=Expression '</label>' '<label' 'kind="exponentialrate"' (ambiguity) '>' exitRate=RatioExpression
	 *     name=STRING '>' '<label' 'kind="exponentialrate"' (ambiguity) '>' exitRate=Expression
	 *     name=STRING '>' '<label' 'kind="exponentialrate"' (ambiguity) '>' exitRate=RatioExpression
	 *     position=Point '>' '<label' 'kind="exponentialrate"' (ambiguity) '>' exitRate=Expression
	 *     position=Point '>' '<label' 'kind="exponentialrate"' (ambiguity) '>' exitRate=RatioExpression
	 */
	protected void emit_ELocation_XmlAttributeParserRuleCall_5_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     target=[Location|STRING] '/>' '<label' 'kind="select"' (ambiguity) '>' selection+=Selection
	 */
	protected void emit_NEdge_XmlAttributeParserRuleCall_3_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     selection+=Selection '</label>' '<label' 'kind="guard"' (ambiguity) '>' guard=Expression
	 *     target=[Location|STRING] '/>' '<label' 'kind="guard"' (ambiguity) '>' guard=Expression
	 */
	protected void emit_NEdge_XmlAttributeParserRuleCall_4_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     guard=Expression '</label>' '<label' 'kind="synchronisation"' (ambiguity) '>' synchronization=Synchronization
	 *     selection+=Selection '</label>' '<label' 'kind="synchronisation"' (ambiguity) '>' synchronization=Synchronization
	 *     target=[Location|STRING] '/>' '<label' 'kind="synchronisation"' (ambiguity) '>' synchronization=Synchronization
	 */
	protected void emit_NEdge_XmlAttributeParserRuleCall_5_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     guard=Expression '</label>' '<label' 'kind="assignment"' (ambiguity) '>' update+=Expression
	 *     selection+=Selection '</label>' '<label' 'kind="assignment"' (ambiguity) '>' update+=Expression
	 *     synchronization=Synchronization '</label>' '<label' 'kind="assignment"' (ambiguity) '>' update+=Expression
	 *     target=[Location|STRING] '/>' '<label' 'kind="assignment"' (ambiguity) '>' update+=Expression
	 */
	protected void emit_NEdge_XmlAttributeParserRuleCall_6_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     color=ColorKind '>' '<name' (ambiguity) '>' comment=ID
	 *     colorCode=STRING '>' '<name' (ambiguity) '>' comment=ID
	 *     name=STRING '>' '<name' (ambiguity) '>' comment=ID
	 *     position=Point '>' '<name' (ambiguity) '>' comment=ID
	 */
	protected void emit_NLocation_XmlAttributeParserRuleCall_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     color=ColorKind '>' '<label' 'kind="invariant"' (ambiguity) '>' invariant=Expression
	 *     colorCode=STRING '>' '<label' 'kind="invariant"' (ambiguity) '>' invariant=Expression
	 *     comment=ID '</name>' '<label' 'kind="invariant"' (ambiguity) '>' invariant=Expression
	 *     name=STRING '>' '<label' 'kind="invariant"' (ambiguity) '>' invariant=Expression
	 *     position=Point '>' '<label' 'kind="invariant"' (ambiguity) '>' invariant=Expression
	 */
	protected void emit_NLocation_XmlAttributeParserRuleCall_2_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     QUERIES?
	 *
	 * This ambiguous syntax occurs at:
	 *     systemDeclarations=SystemDeclarations (ambiguity) '</nta>' (rule end)
	 */
	protected void emit_NSTA_QUERIESTerminalRuleCall_17_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '!' | 'not'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) negatedExpression=UnaryExpression
	 *     (rule start) '('+ (ambiguity) negatedExpression=UnaryExpression
	 *     (rule start) (ambiguity) negatedExpression=UnaryExpression
	 */
	protected void emit_NegationExpression_ExclamationMarkKeyword_0_0_or_NotKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '+' confirmedExpression=UnaryExpression
	 *     (rule start) (ambiguity) '-' invertedExpression=UnaryExpression
	 *     (rule start) (ambiguity) ('!' | 'not') negatedExpression=UnaryExpression
	 *     (rule start) (ambiguity) function=[Function|ID]
	 *     (rule start) (ambiguity) identifier=[NamedElement|ID]
	 *     (rule start) (ambiguity) operator=IncrementDecrementOperator
	 *     (rule start) (ambiguity) quantifier=Quantifier
	 *     (rule start) (ambiguity) text='false'
	 *     (rule start) (ambiguity) text='true'
	 *     (rule start) (ambiguity) text=DOUBLE_STR
	 *     (rule start) (ambiguity) text=INT_STR
	 *     (rule start) (ambiguity) text=STRING
	 *     (rule start) (ambiguity) {ArithmeticExpression.firstExpr=}
	 *     (rule start) (ambiguity) {AssignmentExpression.firstExpr=}
	 *     (rule start) (ambiguity) {BitShiftExpression.firstExpr=}
	 *     (rule start) (ambiguity) {BitwiseExpression.firstExpr=}
	 *     (rule start) (ambiguity) {CompareExpression.firstExpr=}
	 *     (rule start) (ambiguity) {ConditionExpression.ifExpression=}
	 *     (rule start) (ambiguity) {LogicalExpression.firstExpr=}
	 *     (rule start) (ambiguity) {MinMaxExpression.firstExpr=}
	 *     (rule start) (ambiguity) {PostIncrementDecrementExpression.expression=}
	 *     (rule start) (ambiguity) {ScopedIdentifierExpression.scope=}
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '+' confirmedExpression=UnaryExpression
	 *     (rule start) (ambiguity) '-' invertedExpression=UnaryExpression
	 *     (rule start) (ambiguity) ('!' | 'not') negatedExpression=UnaryExpression
	 *     (rule start) (ambiguity) operator=IncrementDecrementOperator
	 *     (rule start) (ambiguity) quantifier=Quantifier
	 *     (rule start) (ambiguity) {ArithmeticExpression.firstExpr=}
	 *     (rule start) (ambiguity) {AssignmentExpression.firstExpr=}
	 *     (rule start) (ambiguity) {BitShiftExpression.firstExpr=}
	 *     (rule start) (ambiguity) {BitwiseExpression.firstExpr=}
	 *     (rule start) (ambiguity) {CompareExpression.firstExpr=}
	 *     (rule start) (ambiguity) {ConditionExpression.ifExpression=}
	 *     (rule start) (ambiguity) {LogicalExpression.firstExpr=}
	 *     (rule start) (ambiguity) {MinMaxExpression.firstExpr=}
	 *     (rule start) (ambiguity) {PostIncrementDecrementExpression.expression=}
	 *     (rule start) (ambiguity) {ScopedIdentifierExpression.scope=}
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':=' | '='
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) referredTemplate=[AbstractTemplate|ID]
	 *     parameter+=Parameter ')' (ambiguity) referredTemplate=[AbstractTemplate|ID]
	 */
	protected void emit_RedefinedTemplate_ColonEqualsSignKeyword_2_0_or_EqualsSignKeyword_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     XmlAttribute*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '<template>' '<name' (ambiguity) '>' name=ID
	 */
	protected void emit_Template_XmlAttributeParserRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
