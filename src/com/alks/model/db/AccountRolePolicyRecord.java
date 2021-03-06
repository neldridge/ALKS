package com.alks.model.db;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * A class representing a Role Policy record
 * 
 * @author Shoban Sriram
 * @author Kamen Tsvetkov
 *
 */
@DynamoDBTable(tableName = "com.alks.table.accountrolepolicy")
public class AccountRolePolicyRecord extends BaseModel {

	private String id;
	private String role;
	private String policy;
	private String accountNo;
 
	/**
	 * Return the ID of the Role Policy Record
	 * 
	 * @return id
	 */
	 @DynamoDBHashKey(attributeName = "id")
	 @DynamoDBAutoGeneratedKey
	public String getId() {
		return id;
	}
	 
	/**
	 * Set the ID of the Role Policy Record
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Return the role of the Role Policy Record
	 * 
	 * @return role
	 */
	@DynamoDBAttribute(attributeName="role")
	public String getRole() {
		return role;
	}
	
	/**
	 * Set the role of the Role Policy Record
	 * 
	 * @param role
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * Return the policy of the Role Policy Record
	 * 
	 * @return policy
	 */
	@DynamoDBAttribute(attributeName="policy")
	public String getPolicy() {
		return policy;
	}
	
	/**
	 * Sets the policy of the Role Policy Record
	 * 
	 * @param policy
	 */
	public void setPolicy(String policy) {
		this.policy = policy;
	}

	/**
	 * Return the account number of the Role Policy Record
	 * 
	 * @return accountNo
	 */
	@DynamoDBAttribute(attributeName="accounts_accountNo")
	public String getAccountNo() {
		return accountNo;
	}
	
	/**
	 * Sets the account number of the Role Policy Record
	 * 
	 * @param accountNo
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * Returns a string representation of a Role Policy Record
	 * 
	 */
	public String toString() { 
	    return super.toString() + "id='" + this.id + "', AccountNo='" + this.accountNo + "', Role='" + this.role + "'" + "', Policy='" + this.policy + "'";
	} 
}
