/*
 * generated by Xtext 2.24.0
 */
package com.intuit.graphql.validation;

import org.eclipse.xtext.validation.ComposedChecks;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators = { DirectiveValidation.class, TypeSystemValidation.class, UnionTypeValidation.class })
public class GraphQLValidator extends AbstractGraphQLValidator {

//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					GraphQLPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}

}
