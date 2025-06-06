package org.kie.kogito;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Document {
    private DocumentTitleCode documentTitleCode;
    private OutcomeReasonCode outcomeReasonCode;

    public enum DocumentTitleCode {
        OTHERS
    }

    public enum OutcomeReasonCode {
        OTHERS
    }
}
