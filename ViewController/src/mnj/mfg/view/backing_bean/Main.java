
package mnj.mfg.view.backing_bean;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpSession;

import mnj.mfg.model.MainAMImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;

public class Main {
    private RichInputText customerBuyerID;
    private RichInputText headerId;
    private RichInputListOfValues style;
    private RichTable size1st;
    private RichTable selectAllTable1;
    private RichTable size2st;
    private RichTable selectAllTable;
    private RichTable bpOTable;
    private RichInputListOfValues headerTransactionType;
    private RichPanelLabelAndMessage transaction;
    private RichInputText transactionNew;
    private RichTable lineTable;
    private RichTable receiving;
    private RichInputListOfValues receiptChallanNo;
    private RichInputDate receiveDate;
    private RichInputText recieptStyleName;
    private RichInputText receivedOrDeleveredSeasen;
    private RichInputText receivedOrDeleveredStyle;
    private RichOutputText sessoinorg;

    public Main() {
        super();
    }


    public void setCustomerIdS(RichInputText id) {

        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("CustomerIdS", id.getValue());
    }

    public void setCustomerBuyerID(RichInputText customerBuyerID) {
        this.customerBuyerID = customerBuyerID;
        setCustomerIdS(customerBuyerID);


    }

    public RichInputText getCustomerBuyerID() {
        return customerBuyerID;
    }


    public void setHeaderIdS(RichInputText id) {

        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("HeaderIdS", id.getValue());
    }

    public void setHeaderId(RichInputText headerId) {
        this.headerId = headerId;
        setHeaderIdS(headerId);
    }

    public RichInputText getHeaderId() {
        return headerId;
    }


    public void setStyle(RichInputListOfValues style) {
        this.style = style;
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("style", style.getValue());
        System.out.println("Session style-->" + style.getValue());
    }

    public RichInputListOfValues getStyle() {
        return style;
    }

    ////////////papulate bpo/////////


    public void editDialogListShadeBPO(DialogEvent dialogEvent) {
        System.out.println("enter editDialogListShade BPO-------------->");
        if (dialogEvent.getOutcome().name().equals("ok")) {


            OperationBinding operationBinding =
                executeOperation("FillRollLinesBPO");
            operationBinding.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(bpOTable);


        }

    }


    public void editPopupCancelListenerBPO(PopupCanceledEvent popupCanceledEvent) {

    }


    public void editPopupFetchListenerBPO(PopupFetchEvent popupFetchEvent) {

        //        OperationBinding operationBinding =
        //            executeOperation("setRollwhereClauseBPO");
        //        operationBinding.execute();
        ;
    }


    ////////////papulate size////////////


    public void editDialogListShade(DialogEvent dialogEvent) {
        System.out.println("enter editDialogListShade-------------->");
        if (dialogEvent.getOutcome().name().equals("ok")) {


            OperationBinding operationBinding =
                executeOperation("FillRollLines");
            operationBinding.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(size1st);


        }

    }


    public void editPopupCancelListener(PopupCanceledEvent popupCanceledEvent) {

    }


    public void editPopupFetchListener(PopupFetchEvent popupFetchEvent) {

        OperationBinding operationBinding =
            executeOperation("setRollwhereClause");
        operationBinding.execute();
    }

    public OperationBinding executeOperation(String operation) {
        OperationBinding createParam =
            getBindingsCont().getOperationBinding(operation);
        return createParam;

    }

    /*****Generic Method to Get BindingContainer**/
    public BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void setSize1st(RichTable size1st) {
        this.size1st = size1st;
    }

    public RichTable getSize1st() {
        return size1st;
    }
    ///////////////////////////////////////////////////////////////
    ////////////papulate similar size////////////


    public void editDialogListShade1(DialogEvent dialogEvent) {
        System.out.println("enter editDialogListShade-------------->");
        if (dialogEvent.getOutcome().name().equals("ok")) {


            OperationBinding operationBinding =
                executeOperation("FillRollLines1");
            operationBinding.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(size2st);


        }

    }


    public void editPopupCancelListener1(PopupCanceledEvent popupCanceledEvent) {

    }


    public void editPopupFetchListener1(PopupFetchEvent popupFetchEvent) {

        OperationBinding operationBinding =
            executeOperation("setRollwhereClause1");
        operationBinding.execute();
    }
    ///////////////////////////////////////////////////////////////
    /////////////////////////

    public void SelectAll1(ActionEvent actionEvent) {
        System.out.println("SelectAll simantaniously");
        // Add event code here...
        OperationBinding operationBinding =
            executeOperation("selectAllLines1");
        operationBinding.getParamsMap().put("flag", "Y");
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(selectAllTable1);
        System.out.println("selectAllTable1");
    }

    public void DeSelectAll1(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding =
            executeOperation("selectAllLines1");
        operationBinding.getParamsMap().put("flag", "N");
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(selectAllTable1);
    }

    /////////////////////

    public void SelectAll(ActionEvent actionEvent) {
        System.out.println("SelectAll");
        // Add event code here...
        OperationBinding operationBinding = executeOperation("selectAllLines");
        operationBinding.getParamsMap().put("flag", "Y");
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(selectAllTable);
        System.out.println("selectAllTable");
    }

    public void DeSelectAll(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding = executeOperation("selectAllLines");
        operationBinding.getParamsMap().put("flag", "N");
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(selectAllTable);
    }

    /////////////////////

    public void setSelectAllTable1(RichTable selectAllTable1) {
        this.selectAllTable1 = selectAllTable1;
    }

    public RichTable getSelectAllTable1() {

        return selectAllTable1;
    }

    public void setSize2st(RichTable size2st) {
        this.size2st = size2st;
    }

    public RichTable getSize2st() {
        return size2st;
    }

    public void setSelectAllTable(RichTable selectAllTable) {
        this.selectAllTable = selectAllTable;
    }

    public RichTable getSelectAllTable() {
        return selectAllTable;
    }

    public void setBpOTable(RichTable bpOTable) {
        this.bpOTable = bpOTable;
    }

    public RichTable getBpOTable() {
        return bpOTable;
    }

    ///////////Code To Get Total ***********************

    public double getTotalValue() {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("IssueInseemSizeDVO1"); //ImpSaleContractDetailEOView1

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.0, total = 0.0;
        while (it.hasNext()) {

            Row r = it.next();
            try {
                val =
Double.parseDouble(r.getAttribute("Quantity").toString());
            } catch (Exception e) {
                ;
            }

            total = total + val;
        } //end of while loop
        it.closeRowSetIterator();
        return total;
    }

    /// Code to Set Total

    public void setLineValueTotal(double val) {

        oracle.adf.view.rich.component.UIXTable table = getBpOTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();


            selectedRow.setAttribute("Quantity", val);


        }

    }
    /////////////////////////////////////


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    //    public String Save() {
    //        OperationBinding operationBinding = executeOperation("save");
    //        operationBinding.execute();
    //
    ////        setLineValueTotal(getTotalValue());
    ////
    ////        AdfFacesContext.getCurrentInstance().addPartialTarget(bpOTable);
    //        // BindingContainer bindings = getBindings();
    //
    //
    //        //        OperationBinding operationBinding =
    //        //            bindings.getOperationBinding("Commit");
    //        //        Object result = operationBinding.execute();
    //        if (!operationBinding.getErrors().isEmpty()) {
    //            return null;
    //        }
    //        return null;
    //    }

    public void setHeaderTransactionType(RichInputListOfValues headerTransactionType) {
        this.headerTransactionType = headerTransactionType;
    }

    public RichInputListOfValues getHeaderTransactionType() {
        return headerTransactionType;
    }

    public void setTransaction(RichPanelLabelAndMessage transaction) {
        this.transaction = transaction;

    }

    public RichPanelLabelAndMessage getTransaction() {
        return transaction;
    }

    public void setTransaction(RichInputText id) {

        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("Transaction", id.getValue());
        System.out.println("Session Transaction -->" + id.getValue());
    }


    public void setTransactionNew(RichInputText transactionNew) {
        this.transactionNew = transactionNew;

        setTransaction(transactionNew);

    }

    public RichInputText getTransactionNew() {
        return transactionNew;
    }


    public void setLineTable(RichTable lineTable) {
        this.lineTable = lineTable;
    }

    public RichTable getLineTable() {
        return lineTable;
    }

    //    public void Populate(ActionEvent actionEvent) {
    //        // Add event code here...
    //        System.out.println("Going In method");
    //
    //        BindingContext bindingContext = BindingContext.getCurrent();
    //        DCDataControl dc =
    //            bindingContext.findDataControl("MainAMDataControl"); //
    //        ApplicationModule am = dc.getApplicationModule();
    //        ViewObject Header = am.findViewObject("NewHeaderVO1");
    //        Header.first();
    //
    //        ViewObject Line = am.findViewObject("HeaderVO1");
    //        System.out.println("Row Count Lines = " + Line.getRowCount());
    //
    //        AdfFacesContext.getCurrentInstance().addPartialTarget(lineTable);
    //
    //
    //        if (Line.getRowCount() > 0) {
    //
    //            FacesContext context = FacesContext.getCurrentInstance();
    //            FacesMessage message =
    //                new FacesMessage("Record Already Fetched...!!");
    //            context.addMessage(null, message);
    //
    //        } else {
    //
    //            OperationBinding operationBinding = executeOperation("Populate");
    //            operationBinding.execute();
    //
    //            FacesContext context = FacesContext.getCurrentInstance();
    //            FacesMessage message = new FacesMessage("Record Fetched...");
    //            context.addMessage(null, message);
    //
    //            if (!operationBinding.getErrors().isEmpty()) {
    //                System.out.println("if errors -->");
    //            }
    //        }
    //
    //    }

    //    public void Populate(ValueChangeEvent vce) {
    //        // Add event code here...
    //
    //        if (vce.getNewValue() != null) {
    //            System.out.println("New Value in Receipt Challan No" +
    //                               vce.getNewValue());
    //
    //            System.out.println("Going In method");
    //            OperationBinding operationBinding = executeOperation("Populate");
    //            operationBinding.getParamsMap().put("ReceiptChallanNo",
    //                                                vce.getNewValue());
    //            operationBinding.execute();
    //
    //            FacesContext context = FacesContext.getCurrentInstance();
    //            FacesMessage message = new FacesMessage("Record Fetched...");
    //            context.addMessage(null, message);
    //
    //            if (!operationBinding.getErrors().isEmpty()) {
    //                System.out.println("if errors -->");
    //            }
    //        }
    //
    //        AdfFacesContext.getCurrentInstance().addPartialTarget(lineTable);
    //        AdfFacesContext.getCurrentInstance().addPartialTarget(receiving);
    //    }

    public void createLines(ActionEvent actionEvent) {
        // Add event code here...
        System.out.println("Going In method");
        OperationBinding operationBinding = executeOperation("createLines");
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors -->");
        }
    }

    public void setReceiving(RichTable receiving) {
        this.receiving = receiving;
    }

    public RichTable getReceiving() {
        return receiving;
    }

    public void Populate(ActionEvent actionEvent) {
        // Add event code here..
        populateBPOs();
        

    }

    public void setReceiptChallanNo(RichInputListOfValues receiptChallanNo) {
        this.receiptChallanNo = receiptChallanNo;
    }

    public RichInputListOfValues getReceiptChallanNo() {
        return receiptChallanNo;
    }

    public void save(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding1 = executeOperation("validateIssueRecDate");
        operationBinding1.execute();
        Object result = operationBinding1.getResult();
        if(result != null){
            System.out.println("Result is "+result.toString());
            if(result.toString().equals("true") ){
                OperationBinding operationBinding = executeOperation("save");
                operationBinding.execute();
            }
        }
    }

    public void DeleteBPOLines(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding =
            executeOperation("Detail_Delete_Check");
        operationBinding.execute();
    }

    public void ReceiveLines_Delete_Check(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding =
            executeOperation("ReceiveLines_Delete_Check");
        operationBinding.execute();
    }

    public void setReceiveDate_S(RichInputDate id) {

        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("ReceiveDate", id.getValue());
        System.out.println("Receive Date is..." + id.getValue());
    }

    public void setReceiveDate(RichInputDate receiveDate) {
        this.receiveDate = receiveDate;
        setReceiveDate_S(receiveDate);
    }

    public RichInputDate getReceiveDate() {
        return receiveDate;
    }

    public void Sizes_delete_check(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding =
            executeOperation("Sizes_Delete_Check");
        operationBinding.execute();
    }
    
    public MainAMImpl getAppM(){
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("MainAMDataControl"); // Name of application module in datacontrolBinding.cpx
        MainAMImpl appM = (MainAMImpl)dc.getDataProvider();
        return appM;
    }
    MainAMImpl am = (MainAMImpl)this.getAppM();
    
    public void challanPopupWhere(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        //ViewObject vo = am.getReceipt_Challan_LOV1();
       
    }

    public void challanDialogSelect(DialogEvent dialogEvent) {
        // Add event code here...
        
        
        ViewObject populatevo = am.getReceipt_Challan_LOV1();
        // populatevo.executeQuery();

        Row[] r = populatevo.getAllRowsInRange();
      
        for (Row row : r) {

            if (row.getAttribute("flag") != null &&
                row.getAttribute("flag").equals(true)) {
              
                popSizeAll1(row);
                 
                populateBPOs();
                
            }
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(lineTable);
      
        
    }
    public void popSizeAll1(Row poprow) {

    
        ViewObject vo = am.getHeaderVO1();
        Row linerow1 = vo.createRow();
        vo.insertRow(linerow1);
        linerow1.setNewRowState(Row.STATUS_INITIALIZED);
        linerow1.setAttribute("PocId",
                              getPopulateValue1(poprow, "PocId"));
        linerow1.setAttribute("ReceiptChallanNo",
                              getPopulateValue1(poprow, "ChallanNo"));
        linerow1.setAttribute("Unit",
                              getPopulateValue1(poprow, "Unit"));
       // linerow1.setAttribute("Attribute5",
                             // getPopulateValue1(poprow, "Buyer"));
       // linerow1.setAttribute("StyleName",
                             // getPopulateValue1(poprow, "StyleName"));
       // linerow1.setAttribute("Season",
                             // getPopulateValue1(poprow, "Season"));
        linerow1.setAttribute("UpdateOn",
                              getPopulateValue1(poprow, "IssuanceDate"));

        vo.setCurrentRow(linerow1);
    } //end of populateLines
    
    public String getPopulateValue1(Row r, String columnName) {

        String value = null;
        try {
            value = r.getAttribute(columnName).toString();
        } catch (Exception e) {
            ;
        }
        return value;
    }

    private void populateBPOs() {
        System.out.println("Going In method");

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
       
        ViewObject Line = am.findViewObject("MNJ_ISSUE_REC_WASH_REC_L_VO1");
     

        AdfFacesContext.getCurrentInstance().addPartialTarget(lineTable);


        if (Line.getRowCount() > 0) {

            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message =
                new FacesMessage("Record Already Fetched...!!");
            context.addMessage(null, message);

        } else {

            OperationBinding operationBinding = executeOperation("Populate");
            operationBinding.getParamsMap().put("ReceiptChallanNo",
                                                receiptChallanNo.getValue());

            
            operationBinding.execute();

           
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(receiving);
    }

    public void setRecieptStyleName(RichInputText recieptStyleName) {
        this.recieptStyleName = recieptStyleName;
    }

    public RichInputText getRecieptStyleName() {
        return recieptStyleName;
    }

    public void deleteAllBpo(ActionEvent actionEvent) {
        // Add event code here...
        ViewObject hederVo = am.getHeaderVO1();
        
        ViewObject washRecLvo = am.getMNJ_ISSUE_REC_WASH_REC_L_VO1();
        washRecLvo.setRangeSize(200);
                            
//        System.out.println("========== washRecLvo.getAllRowsInRange().length   "+washRecLvo.getAllRowsInRange().length);
//        
//        System.out.println("========== washRecLvo.getFetchedRowCount()   "+washRecLvo.getFetchedRowCount());
        RowSet sizeRows;
        
        Row[] washRecLvoRows =  washRecLvo.getAllRowsInRange();
            
            for( Row washRecLvoRow : washRecLvoRows ){
                
                sizeRows = (RowSet)washRecLvoRow.getAttribute("MNJ_ISSUEREC_WASH_REC_SIZE_VO");
                while(sizeRows.hasNext()){
                    Row sezeRow = sizeRows.next();
                    sezeRow.remove();
                }
                
                washRecLvoRow.remove();
            }
        
        
    }

    public void setReceivedOrDeleveredSeasen(RichInputText receivedOrDeleveredSeasen) {
        this.receivedOrDeleveredSeasen = receivedOrDeleveredSeasen;
    }

    public RichInputText getReceivedOrDeleveredSeasen() {
        return receivedOrDeleveredSeasen;
    }

    public void setReceivedOrDeleveredStyle(RichInputText receivedOrDeleveredStyle) {
        this.receivedOrDeleveredStyle = receivedOrDeleveredStyle;
    }

    public RichInputText getReceivedOrDeleveredStyle() {
        return receivedOrDeleveredStyle;
    }

    public void SearchNewHeaderVo(ActionEvent actionEvent) {
        // Add event code here...
        
        String org ;
        
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
       //  org = (String)sessionScope.get("OrgId");
        
        try{
            org = (String)sessionScope.get("orgId");
            this.sessoinorg.setValue(org);
        }
        
        
        catch(Exception e){
            this.sessoinorg.setValue("no org");
            org=null;
        }
        
        
       
        StringBuilder receiveNos ;
        receiveNos = new StringBuilder("('dummy')");

      
        
        
        
        System.out.println("========================== in   SearchNewHeaderVo ");

      ViewObject washingRecDelVo = am.getWashingRecDelFilterVo1();
      String style ;
      String season;
      
        ViewObject newHeaderVo = am.getNewHeaderVO1();
        newHeaderVo.setWhereClause(null);
        newHeaderVo.setNamedWhereClauseParam("p_org", org);
        newHeaderVo.executeQuery();
        
      
      try{
         // style = getReceivedOrDeleveredStyle().getValue().toString();
          
          style = receivedOrDeleveredStyle.getValue().toString();
          if (style.length()==0){
              style="noStyle";
          }
          System.out.println("========================== style "+style );
          
      }catch(Exception e){
          
          style="noStyle";
          System.out.println("========================== style "+style );
      }
      
      
      
      try{
            season = receivedOrDeleveredSeasen.getValue().toString();
          
          if (season.length()==0){
              style="noSeason";
          }
          System.out.println("========================== season "+season );
      }catch(Exception e){
            
            season="noSeason";
           System.out.println("========================== season "+season );
       }
        
        
        System.out.println("============================================================== style "+style );
        System.out.println("============================================================== season "+season );
        
        String whereclause="";
        
        if (style.equals("noStyle") &&  season.equals("noSeason") ){
            
//            newHeaderVo.setWhereClause(null);
//            newHeaderVo.setNamedWhereClauseParam("p_org", "343");
//            newHeaderVo.executeQuery();
            
            System.out.println("========================== no style season  " );
          return;
          
          
        }
        else if (style.equals("noStyle") && !season.equals("noSeason")){
            
            
            whereclause="SEASON LIKE '%"+season+"%'";
            
            System.out.println("==========================   " +whereclause);
            
        }
        else if ( !style.equals("noStyle") && season.equals("noSeason")){
            whereclause="STYLE_NAME LIKE '%"+style+"%'";
            System.out.println("==========================   " +whereclause);
        }
        else{
            whereclause="STYLE_NAME LIKE '%"+style+"%' AND SEASON LIKE '%"+season+"%'";
            System.out.println("==========================   " +whereclause);
        }
        
        washingRecDelVo.setWhereClause(whereclause);
        washingRecDelVo.executeQuery();
        
        
        int numberOfRows =0;
        washingRecDelVo.setRangeSize(100);
         Row[] washingRecDelRows = washingRecDelVo.getAllRowsInRange();
        numberOfRows = washingRecDelRows.length;
        System.out.println(" ============ washingRecDelRows.length  "+numberOfRows );
          
        if(numberOfRows==0){
            System.out.println("========================== in numberOfRows==0  " +numberOfRows);
            
            newHeaderVo.setWhereClause("RECEIVE_NO IN "+receiveNos);
            newHeaderVo.setNamedWhereClauseParam("p_org", org);
            newHeaderVo.executeQuery();
            return;
        }
       
             
         else{
             
                 receiveNos  = new StringBuilder("");
             receiveNos.append("(");
                  
             for ( Row washingRecDelRow : washingRecDelRows ){
                 System.out.println(" in    for ( Row washingRecDelRow : washingRecDelRows )         ");
                 
                 receiveNos.append("'");
                 receiveNos.append(washingRecDelRow.getAttribute("ReceiveNo").toString());
                 receiveNos.append("'");
                 receiveNos.append(",");
               
                 System.out.println("  in    for    receiveNos   " + receiveNos);
                 
             } 
             receiveNos.deleteCharAt(receiveNos.length()-1);
             receiveNos.append(")");
                  
         }
         
         
        
        System.out.println("==========================     RECEIVE_NO IN "+receiveNos);
        newHeaderVo.setWhereClause("RECEIVE_NO IN "+receiveNos);
        newHeaderVo.setNamedWhereClauseParam("p_org", org);
        newHeaderVo.executeQuery();
       
                
        
    }

    public void setSessoinorg(RichOutputText sessoinorg) {
        this.sessoinorg = sessoinorg;
    }

    public RichOutputText getSessoinorg() {
        return sessoinorg;
    }
}


