

/* First created by JCasGen Wed Feb 13 16:54:59 EST 2013 */
package edu.cmu.lti.uima.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Apr 26 22:51:47 EDT 2013
 * XML source: /Users/Yitei/Projects/EMRCode/trunk/combined_src/EMREngine/descriptors/TypeSystem.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: DocID

  /** getter for DocID - gets 
   * @generated */
  public String getDocID() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_DocID == null)
      jcasType.jcas.throwFeatMissing("DocID", "edu.cmu.lti.uima.types.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_DocID);}
    
  /** setter for DocID - sets  
   * @generated */
  public void setDocID(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_DocID == null)
      jcasType.jcas.throwFeatMissing("DocID", "edu.cmu.lti.uima.types.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_DocID, v);}    
   
    
  //*--------------*
  //* Feature: Tag

  /** getter for Tag - gets 
   * @generated */
  public String getTag() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Tag == null)
      jcasType.jcas.throwFeatMissing("Tag", "edu.cmu.lti.uima.types.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_Tag);}
    
  /** setter for Tag - sets  
   * @generated */
  public void setTag(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Tag == null)
      jcasType.jcas.throwFeatMissing("Tag", "edu.cmu.lti.uima.types.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_Tag, v);}    
  }

    