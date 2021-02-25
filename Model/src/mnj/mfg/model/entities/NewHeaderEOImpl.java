package mnj.mfg.model.entities;

import java.sql.CallableStatement;
import java.sql.SQLException;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;

import oracle.jdbc.OracleTypes;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Dec 29 15:54:19 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class NewHeaderEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        IrHeaderId {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getIrHeaderId();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setIrHeaderId((Number)value);
            }
        }
        ,
        ProcessDetailId {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getProcessDetailId();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setProcessDetailId((Number)value);
            }
        }
        ,
        ReceiveNo {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getReceiveNo();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setReceiveNo((String)value);
            }
        }
        ,
        DocumentDate {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getDocumentDate();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setDocumentDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        RespId {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getRespId();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setRespId((Number)value);
            }
        }
        ,
        RespApplId {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getRespApplId();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setRespApplId((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        UnitName {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getUnitName();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setUnitName((String)value);
            }
        }
        ,
        ReceiptChallanNo {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getReceiptChallanNo();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setReceiptChallanNo((String)value);
            }
        }
        ,
        Remarks {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getRemarks();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setRemarks((String)value);
            }
        }
        ,
        MasterChallanNo {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getMasterChallanNo();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setMasterChallanNo((Number)value);
            }
        }
        ,
        MasterChallanDate {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getMasterChallanDate();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setMasterChallanDate((Date)value);
            }
        }
        ,
        DeliveryDate {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getDeliveryDate();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setDeliveryDate((Date)value);
            }
        }
        ,
        Unit {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getUnit();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setUnit((String)value);
            }
        }
        ,
        UnitId {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getUnitId();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setUnitId((Number)value);
            }
        }
        ,
        ChallanType {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getChallanType();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setChallanType((String)value);
            }
        }
        ,
        HeaderEO {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getHeaderEO();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MNJ_ISSUE_REC_WASH_DEL_L_EO {
            public Object get(NewHeaderEOImpl obj) {
                return obj.getMNJ_ISSUE_REC_WASH_DEL_L_EO();
            }

            public void put(NewHeaderEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(NewHeaderEOImpl object);

        public abstract void put(NewHeaderEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int IRHEADERID = AttributesEnum.IrHeaderId.index();
    public static final int PROCESSDETAILID = AttributesEnum.ProcessDetailId.index();
    public static final int RECEIVENO = AttributesEnum.ReceiveNo.index();
    public static final int DOCUMENTDATE = AttributesEnum.DocumentDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int RESPID = AttributesEnum.RespId.index();
    public static final int RESPAPPLID = AttributesEnum.RespApplId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int UNITNAME = AttributesEnum.UnitName.index();
    public static final int RECEIPTCHALLANNO = AttributesEnum.ReceiptChallanNo.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int MASTERCHALLANNO = AttributesEnum.MasterChallanNo.index();
    public static final int MASTERCHALLANDATE = AttributesEnum.MasterChallanDate.index();
    public static final int DELIVERYDATE = AttributesEnum.DeliveryDate.index();
    public static final int UNIT = AttributesEnum.Unit.index();
    public static final int UNITID = AttributesEnum.UnitId.index();
    public static final int CHALLANTYPE = AttributesEnum.ChallanType.index();
    public static final int HEADEREO = AttributesEnum.HeaderEO.index();
    public static final int MNJ_ISSUE_REC_WASH_DEL_L_EO = AttributesEnum.MNJ_ISSUE_REC_WASH_DEL_L_EO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public NewHeaderEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.mfg.model.entities.NewHeaderEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for IrHeaderId, using the alias name IrHeaderId.
     * @return the IrHeaderId
     */
    public Number getIrHeaderId() {
        return (Number)getAttributeInternal(IRHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for IrHeaderId.
     * @param value value to set the IrHeaderId
     */
    public void setIrHeaderId(Number value) {
        setAttributeInternal(IRHEADERID, value);
    }

    /**
     * Gets the attribute value for ProcessDetailId, using the alias name ProcessDetailId.
     * @return the ProcessDetailId
     */
    public Number getProcessDetailId() {
        return (Number)getAttributeInternal(PROCESSDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProcessDetailId.
     * @param value value to set the ProcessDetailId
     */
    public void setProcessDetailId(Number value) {
        setAttributeInternal(PROCESSDETAILID, value);
    }

    /**
     * Gets the attribute value for ReceiveNo, using the alias name ReceiveNo.
     * @return the ReceiveNo
     */
    public String getReceiveNo() {
        return (String)getAttributeInternal(RECEIVENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReceiveNo.
     * @param value value to set the ReceiveNo
     */
    public void setReceiveNo(String value) {
        setAttributeInternal(RECEIVENO, value);
    }

    /**
     * Gets the attribute value for DocumentDate, using the alias name DocumentDate.
     * @return the DocumentDate
     */
    public Date getDocumentDate() {
        return (Date)getAttributeInternal(DOCUMENTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocumentDate.
     * @param value value to set the DocumentDate
     */
    public void setDocumentDate(Date value) {
        setAttributeInternal(DOCUMENTDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for RespId, using the alias name RespId.
     * @return the RespId
     */
    public Number getRespId() {
        return (Number)getAttributeInternal(RESPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RespId.
     * @param value value to set the RespId
     */
    public void setRespId(Number value) {
        setAttributeInternal(RESPID, value);
    }

    /**
     * Gets the attribute value for RespApplId, using the alias name RespApplId.
     * @return the RespApplId
     */
    public Number getRespApplId() {
        return (Number)getAttributeInternal(RESPAPPLID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RespApplId.
     * @param value value to set the RespApplId
     */
    public void setRespApplId(Number value) {
        setAttributeInternal(RESPAPPLID, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number)getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgId.
     * @param value value to set the OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for UnitName, using the alias name UnitName.
     * @return the UnitName
     */
    public String getUnitName() {
        return (String)getAttributeInternal(UNITNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnitName.
     * @param value value to set the UnitName
     */
    public void setUnitName(String value) {
        setAttributeInternal(UNITNAME, value);
    }

    /**
     * Gets the attribute value for ReceiptChallanNo, using the alias name ReceiptChallanNo.
     * @return the ReceiptChallanNo
     */
    public String getReceiptChallanNo() {
        return (String)getAttributeInternal(RECEIPTCHALLANNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReceiptChallanNo.
     * @param value value to set the ReceiptChallanNo
     */
    public void setReceiptChallanNo(String value) {
        setAttributeInternal(RECEIPTCHALLANNO, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the Remarks
     */
    public String getRemarks() {
        return (String)getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for MasterChallanNo, using the alias name MasterChallanNo.
     * @return the MasterChallanNo
     */
    public Number getMasterChallanNo() {
        return (Number)getAttributeInternal(MASTERCHALLANNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for MasterChallanNo.
     * @param value value to set the MasterChallanNo
     */
    public void setMasterChallanNo(Number value) {
        setAttributeInternal(MASTERCHALLANNO, value);
    }

    /**
     * Gets the attribute value for MasterChallanDate, using the alias name MasterChallanDate.
     * @return the MasterChallanDate
     */
    public Date getMasterChallanDate() {
        return (Date)getAttributeInternal(MASTERCHALLANDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for MasterChallanDate.
     * @param value value to set the MasterChallanDate
     */
    public void setMasterChallanDate(Date value) {
        setAttributeInternal(MASTERCHALLANDATE, value);
    }

    /**
     * Gets the attribute value for DeliveryDate, using the alias name DeliveryDate.
     * @return the DeliveryDate
     */
    public Date getDeliveryDate() {
        return (Date)getAttributeInternal(DELIVERYDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DeliveryDate.
     * @param value value to set the DeliveryDate
     */
    public void setDeliveryDate(Date value) {
        setAttributeInternal(DELIVERYDATE, value);
    }

    /**
     * Gets the attribute value for Unit, using the alias name Unit.
     * @return the Unit
     */
    public String getUnit() {
        return (String)getAttributeInternal(UNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Unit.
     * @param value value to set the Unit
     */
    public void setUnit(String value) {
        setAttributeInternal(UNIT, value);
    }

    /**
     * Gets the attribute value for UnitId, using the alias name UnitId.
     * @return the UnitId
     */
    public Number getUnitId() {
        return (Number)getAttributeInternal(UNITID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnitId.
     * @param value value to set the UnitId
     */
    public void setUnitId(Number value) {
        setAttributeInternal(UNITID, value);
    }

    /**
     * Gets the attribute value for ChallanType, using the alias name ChallanType.
     * @return the ChallanType
     */
    public String getChallanType() {
        return (String)getAttributeInternal(CHALLANTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChallanType.
     * @param value value to set the ChallanType
     */
    public void setChallanType(String value) {
        setAttributeInternal(CHALLANTYPE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getHeaderEO() {
        return (RowIterator)getAttributeInternal(HEADEREO);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMNJ_ISSUE_REC_WASH_DEL_L_EO() {
        return (RowIterator)getAttributeInternal(MNJ_ISSUE_REC_WASH_DEL_L_EO);
    }


    /**
     * @param irHeaderId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number irHeaderId) {
        return new Key(new Object[]{irHeaderId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
//        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_MFG_WASH_IR_H_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setIrHeaderId(sVal);
        
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
     protected void doDML(int operation, TransactionEvent e) {

    
    Map sessionScope    = ADFContext.getCurrent().getSessionScope();
    String user         = (String)sessionScope.get("userId");
    String orgId        = (String)sessionScope.get("orgId");
    String unitName     = (String)sessionScope.get("unitName");


    if (operation == DML_INSERT) {


        try {
            setReceiveNo(String.valueOf(getSrNoString())); 
            setMasterChallanNo(new oracle.jbo.domain.Number(getMasterChallanNoSer()));
            setOrgId(new oracle.jbo.domain.Number(orgId));
            setUnitName(unitName);
            setCreationDate((Date)Date.getCurrentDate());
            setCreatedBy(new oracle.jbo.domain.Number(user));


        } catch (SQLException f) {
            ;
        }
    } else if (DML_UPDATE == operation) {
        try {
            setLastUpdateDate((Date)Date.getCurrentDate());
            setLastUpdatedBy(new oracle.jbo.domain.Number(user));
        } catch (SQLException f) {
            ;
        }
    }

    super.doDML(operation, e);
    }
    
    public String getSrNoString() {
        String srno = null;
        String stmt = "BEGIN :1 := mnj_mfg_doc_no_pkg.Issue_recv_doc_no; end;";
        java.sql.CallableStatement cs =
            getDBTransaction().createCallableStatement(stmt, 1);
        try {
            cs.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            cs.execute();
            srno = cs.getString(1);
            cs.close();
            System.out.println(srno+"srno--->"+srno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return srno;
    }
    
    public int getMasterChallanNoSer() {


        int result = 0;
        String stmt = "BEGIN :1 := MNJ_MASTER_CHALLAN_NO_F(); end;";

        CallableStatement cs =
            getDBTransaction().createCallableStatement(stmt, 1);
        try {
            cs.registerOutParameter(1, OracleTypes.VARCHAR);
            cs.execute();
            result = cs.getInt(1);
            cs.close();

        } catch (Exception e) {
            result = 0;
        }
        return result;

    }
}
