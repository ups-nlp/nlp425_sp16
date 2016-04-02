package edu.pugetsound.mathcs.nlp.processactions.srt;

import java.util.Random;

import edu.pugetsound.mathcs.nlp.lang.Utterance;
import edu.pugetsound.mathcs.nlp.datag.DialogueActTag;
import edu.pugetsound.mathcs.nlp.lang.AMR;
import edu.pugetsound.mathcs.nlp.processactions.srt.SemanticResponseTemplate;

/**
 * @author Thomas Gagne
 * A template for constructing a response where the computer expresses that it does not know something.
 * Example responses include "I don't know." or "I'm not really sure."
 */
public class IndeterminateResponseTemplate implements SemanticResponseTemplate {

    private static final String[] outputs = {
        "I don't know.",
        "I don't really know.",
        "I'm not sure.",
        "I'm not really sure."
    };

    @Override
    public String constructResponseFromTemplate(Utterance utterance) {
        Random rand = new Random();
        return outputs[rand.nextInt(outputs.length)];
    }

}

