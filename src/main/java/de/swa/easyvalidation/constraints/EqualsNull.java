package de.swa.easyvalidation.constraints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EqualsNull extends EqualsRoot {

    private static Logger log = LoggerFactory.getLogger(EqualsNull.class);

    EqualsNull() {
    }

    @Override
    public String getType() {
        return "EQUALS_NULL";
    }

    @Override
    public boolean validate(final Object object, final Object ignored) {
        return object == null;
    }

}
