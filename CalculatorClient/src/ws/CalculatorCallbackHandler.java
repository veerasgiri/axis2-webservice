
/**
 * CalculatorCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package ws;

    /**
     *  CalculatorCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CalculatorCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CalculatorCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CalculatorCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for subtraction method
            * override this method for handling normal response from subtraction operation
            */
           public void receiveResultsubtraction(
                    ws.CalculatorStub.SubtractionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from subtraction operation
           */
            public void receiveErrorsubtraction(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for multiplication method
            * override this method for handling normal response from multiplication operation
            */
           public void receiveResultmultiplication(
                    ws.CalculatorStub.MultiplicationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from multiplication operation
           */
            public void receiveErrormultiplication(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addition method
            * override this method for handling normal response from addition operation
            */
           public void receiveResultaddition(
                    ws.CalculatorStub.AdditionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addition operation
           */
            public void receiveErroraddition(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for division method
            * override this method for handling normal response from division operation
            */
           public void receiveResultdivision(
                    ws.CalculatorStub.DivisionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from division operation
           */
            public void receiveErrordivision(java.lang.Exception e) {
            }
                


    }
    