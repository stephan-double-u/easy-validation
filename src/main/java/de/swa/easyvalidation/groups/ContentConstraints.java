package de.swa.easyvalidation.groups;

import de.swa.easyvalidation.constraints.ConstraintRoot;

public class ContentConstraints {

    private final ConstraintRoot contentConstraint;
    private final RelationsTopGroup relationsTopGroup;

    public ContentConstraints(final ConstraintRoot contentConstraint, final RelationsTopGroup relationsTopGroup) {
        this.contentConstraint = contentConstraint;
        this.relationsTopGroup = relationsTopGroup;
    }

    public ConstraintRoot getContentConstraint() {
        return contentConstraint;
    }

    public RelationsTopGroup getRelationsTopGroup() {
        return relationsTopGroup;
    }

}
