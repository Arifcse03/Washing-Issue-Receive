package mnj.mfg.model.views;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 30 11:23:08 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HeaderVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public HeaderVOImpl() {
    }

    /**
     * Returns the variable value for p_Doc.
     * @return variable value for p_Doc
     */
    public String getp_Doc() {
        return (String)ensureVariableManager().getVariableValue("p_Doc");
    }

    /**
     * Sets <code>value</code> for variable p_Doc.
     * @param value value to bind as p_Doc
     */
    public void setp_Doc(String value) {
        ensureVariableManager().setVariableValue("p_Doc", value);
    }


}
