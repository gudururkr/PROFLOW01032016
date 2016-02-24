package page.lospoc;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class BalanceSheetDetails implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "BALANCESHEETDETAILS_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "BALANCESHEETDETAILS_ID_GENERATOR", sequenceName = "BALANCESHEETDETAILS_ID_SEQ")
   private java.lang.Long id;

   private java.lang.Integer cashAtBank;

   private java.lang.Integer creditCard;

   private java.lang.Integer creditSocietyLoan;

   private java.lang.Integer currentBalanceInPf;

   private java.lang.Integer employerLoan;

   private java.lang.Integer fixedDeposits;

   private java.lang.Integer homeLoan;

   private java.lang.Integer otherLoan;

   private java.lang.Integer others;

   private java.lang.Integer personalLoan;

   private java.lang.Integer pfLoan;

   private java.lang.Long processInstanceID;

   private java.lang.Integer totalAssests;

   private java.lang.Integer totalLiabilites;

   private java.lang.Integer valueOfImmovableProperty;

   private java.lang.Integer valueOfShareAndSecurities;

   private java.lang.Integer vehicleLoan;

   public BalanceSheetDetails()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.Integer getCashAtBank()
   {
      return this.cashAtBank;
   }

   public void setCashAtBank(java.lang.Integer cashAtBank)
   {
      this.cashAtBank = cashAtBank;
   }

   public java.lang.Integer getCreditCard()
   {
      return this.creditCard;
   }

   public void setCreditCard(java.lang.Integer creditCard)
   {
      this.creditCard = creditCard;
   }

   public java.lang.Integer getCreditSocietyLoan()
   {
      return this.creditSocietyLoan;
   }

   public void setCreditSocietyLoan(java.lang.Integer creditSocietyLoan)
   {
      this.creditSocietyLoan = creditSocietyLoan;
   }

   public java.lang.Integer getCurrentBalanceInPf()
   {
      return this.currentBalanceInPf;
   }

   public void setCurrentBalanceInPf(java.lang.Integer currentBalanceInPf)
   {
      this.currentBalanceInPf = currentBalanceInPf;
   }

   public java.lang.Integer getEmployerLoan()
   {
      return this.employerLoan;
   }

   public void setEmployerLoan(java.lang.Integer employerLoan)
   {
      this.employerLoan = employerLoan;
   }

   public java.lang.Integer getFixedDeposits()
   {
      return this.fixedDeposits;
   }

   public void setFixedDeposits(java.lang.Integer fixedDeposits)
   {
      this.fixedDeposits = fixedDeposits;
   }

   public java.lang.Integer getHomeLoan()
   {
      return this.homeLoan;
   }

   public void setHomeLoan(java.lang.Integer homeLoan)
   {
      this.homeLoan = homeLoan;
   }

   public java.lang.Integer getOtherLoan()
   {
      return this.otherLoan;
   }

   public void setOtherLoan(java.lang.Integer otherLoan)
   {
      this.otherLoan = otherLoan;
   }

   public java.lang.Integer getOthers()
   {
      return this.others;
   }

   public void setOthers(java.lang.Integer others)
   {
      this.others = others;
   }

   public java.lang.Integer getPersonalLoan()
   {
      return this.personalLoan;
   }

   public void setPersonalLoan(java.lang.Integer personalLoan)
   {
      this.personalLoan = personalLoan;
   }

   public java.lang.Integer getPfLoan()
   {
      return this.pfLoan;
   }

   public void setPfLoan(java.lang.Integer pfLoan)
   {
      this.pfLoan = pfLoan;
   }

   public java.lang.Long getProcessInstanceID()
   {
      return this.processInstanceID;
   }

   public void setProcessInstanceID(java.lang.Long processInstanceID)
   {
      this.processInstanceID = processInstanceID;
   }

   public java.lang.Integer getTotalAssests()
   {
      return this.totalAssests;
   }

   public void setTotalAssests(java.lang.Integer totalAssests)
   {
      this.totalAssests = totalAssests;
   }

   public java.lang.Integer getTotalLiabilites()
   {
      return this.totalLiabilites;
   }

   public void setTotalLiabilites(java.lang.Integer totalLiabilites)
   {
      this.totalLiabilites = totalLiabilites;
   }

   public java.lang.Integer getValueOfImmovableProperty()
   {
      return this.valueOfImmovableProperty;
   }

   public void setValueOfImmovableProperty(
         java.lang.Integer valueOfImmovableProperty)
   {
      this.valueOfImmovableProperty = valueOfImmovableProperty;
   }

   public java.lang.Integer getValueOfShareAndSecurities()
   {
      return this.valueOfShareAndSecurities;
   }

   public void setValueOfShareAndSecurities(
         java.lang.Integer valueOfShareAndSecurities)
   {
      this.valueOfShareAndSecurities = valueOfShareAndSecurities;
   }

   public java.lang.Integer getVehicleLoan()
   {
      return this.vehicleLoan;
   }

   public void setVehicleLoan(java.lang.Integer vehicleLoan)
   {
      this.vehicleLoan = vehicleLoan;
   }

   public BalanceSheetDetails(java.lang.Long id, java.lang.Integer cashAtBank,
         java.lang.Integer creditCard, java.lang.Integer creditSocietyLoan,
         java.lang.Integer currentBalanceInPf,
         java.lang.Integer employerLoan, java.lang.Integer fixedDeposits,
         java.lang.Integer homeLoan, java.lang.Integer otherLoan,
         java.lang.Integer others, java.lang.Integer personalLoan,
         java.lang.Integer pfLoan, java.lang.Long processInstanceID,
         java.lang.Integer totalAssests, java.lang.Integer totalLiabilites,
         java.lang.Integer valueOfImmovableProperty,
         java.lang.Integer valueOfShareAndSecurities,
         java.lang.Integer vehicleLoan)
   {
      this.id = id;
      this.cashAtBank = cashAtBank;
      this.creditCard = creditCard;
      this.creditSocietyLoan = creditSocietyLoan;
      this.currentBalanceInPf = currentBalanceInPf;
      this.employerLoan = employerLoan;
      this.fixedDeposits = fixedDeposits;
      this.homeLoan = homeLoan;
      this.otherLoan = otherLoan;
      this.others = others;
      this.personalLoan = personalLoan;
      this.pfLoan = pfLoan;
      this.processInstanceID = processInstanceID;
      this.totalAssests = totalAssests;
      this.totalLiabilites = totalLiabilites;
      this.valueOfImmovableProperty = valueOfImmovableProperty;
      this.valueOfShareAndSecurities = valueOfShareAndSecurities;
      this.vehicleLoan = vehicleLoan;
   }

}