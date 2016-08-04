package it.aDoctor.smellDetectionRules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import it.aDoctor.beans.ClassBean;

public class InefficientDataStructureRule {

	public boolean isInefficientDataStructure(ClassBean pClass) {
		
		Pattern regex = Pattern.compile("(.*)HashMap<(\\s*)(Integer|Long)(\\s*),(\\s*)(.+)(\\s*)>", Pattern.MULTILINE);
		Matcher regexMatcher = regex.matcher(pClass.getTextContent());
		if (regexMatcher.find()) {
		    return true;
		} 
		return false;
	}

}
