
/* First created by JCasGen Fri Apr 26 22:51:47 EDT 2013 */
package edu.cmu.lti.uima.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Apr 26 22:51:47 EDT 2013
 * @generated */
public class Sentence_ExpandedNE_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_ExpandedNE_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_ExpandedNE_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence_ExpandedNE(addr, Sentence_ExpandedNE_Type.this);
  			   Sentence_ExpandedNE_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence_ExpandedNE(addr, Sentence_ExpandedNE_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence_ExpandedNE.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.uima.types.Sentence_ExpandedNE");
 
  /** @generated */
  final Feature casFeat_DocID;
  /** @generated */
  final int     casFeatCode_DocID;
  /** @generated */ 
  public String getDocID(int addr) {
        if (featOkTst && casFeat_DocID == null)
      jcas.throwFeatMissing("DocID", "edu.cmu.lti.uima.types.Sentence_ExpandedNE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_DocID);
  }
  /** @generated */    
  public void setDocID(int addr, String v) {
        if (featOkTst && casFeat_DocID == null)
      jcas.throwFeatMissing("DocID", "edu.cmu.lti.uima.types.Sentence_ExpandedNE");
    ll_cas.ll_setStringValue(addr, casFeatCode_DocID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Tag;
  /** @generated */
  final int     casFeatCode_Tag;
  /** @generated */ 
  public String getTag(int addr) {
        if (featOkTst && casFeat_Tag == null)
      jcas.throwFeatMissing("Tag", "edu.cmu.lti.uima.types.Sentence_ExpandedNE");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Tag);
  }
  /** @generated */    
  public void setTag(int addr, String v) {
        if (featOkTst && casFeat_Tag == null)
      jcas.throwFeatMissing("Tag", "edu.cmu.lti.uima.types.Sentence_ExpandedNE");
    ll_cas.ll_setStringValue(addr, casFeatCode_Tag, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Sentence_ExpandedNE_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_DocID = jcas.getRequiredFeatureDE(casType, "DocID", "uima.cas.String", featOkTst);
    casFeatCode_DocID  = (null == casFeat_DocID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_DocID).getCode();

 
    casFeat_Tag = jcas.getRequiredFeatureDE(casType, "Tag", "uima.cas.String", featOkTst);
    casFeatCode_Tag  = (null == casFeat_Tag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Tag).getCode();

  }
}



    