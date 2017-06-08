// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.awreporting.model.entities;

import com.google.api.ads.adwords.awreporting.model.csv.annotation.CsvField;
import com.google.api.ads.adwords.awreporting.model.csv.annotation.CsvReport;
import com.google.api.ads.adwords.lib.jaxb.v201705.ReportDefinitionReportType;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
   * Specific report class for CampaignNegativeKeywordsPerformanceReport.
 *
*/
@Entity
@Table(name = "AW_CampaignNegativeKeywordsPerformanceReport")
@CsvReport(value = ReportDefinitionReportType.CAMPAIGN_NEGATIVE_KEYWORDS_PERFORMANCE_REPORT)
public class CampaignNegativeKeywordsPerformanceReport extends Report {

  @Column(name = "AccountCurrencyCode")
  @CsvField(value = "Currency", reportField = "AccountCurrencyCode")
  private String accountCurrencyCode;

  @Column(name = "AccountDescriptiveName")
  @CsvField(value = "Account", reportField = "AccountDescriptiveName")
  private String accountDescriptiveName;

  @Column(name = "AccountTimeZone")
  @CsvField(value = "Time zone", reportField = "AccountTimeZone")
  private String accountTimeZone;

  @Column(name = "BaseCampaignId")
  @CsvField(value = "Base Campaign ID", reportField = "BaseCampaignId")
  private Long baseCampaignId;

  @Column(name = "CampaignId")
  @CsvField(value = "Campaign ID", reportField = "CampaignId")
  private Long campaignId;

  @Column(name = "CampaignName")
  @CsvField(value = "Campaign", reportField = "CampaignName")
  private String campaignName;

  @Column(name = "CampaignStatus")
  @CsvField(value = "Campaign state", reportField = "CampaignStatus")
  private String campaignStatus;

  @Column(name = "Criteria")
  @CsvField(value = "Negative keyword", reportField = "Criteria")
  private String criteria;

  @Column(name = "CustomerDescriptiveName")
  @CsvField(value = "Client name", reportField = "CustomerDescriptiveName")
  private String customerDescriptiveName;

  @Column(name = "Id")
  @CsvField(value = "Keyword ID", reportField = "Id")
  private Long id;

  @Column(name = "IsNegative")
  @CsvField(value = "Is negative", reportField = "IsNegative")
  private String isNegative;

  @Column(name = "KeywordMatchType")
  @CsvField(value = "Match type", reportField = "KeywordMatchType")
  private String keywordMatchType;

  /**
   * Hibernate needs an empty constructor
   */
  public CampaignNegativeKeywordsPerformanceReport() {
  }

  public CampaignNegativeKeywordsPerformanceReport(Long topAccountId, Long accountId){
    super(topAccountId, accountId);
  }

  public String getAccountCurrencyCode() {
    return accountCurrencyCode;
  }

  public void setAccountCurrencyCode(String accountCurrencyCode) {
    this.accountCurrencyCode = accountCurrencyCode;
  }

  public String getAccountDescriptiveName() {
    return accountDescriptiveName;
  }

  public void setAccountDescriptiveName(String accountDescriptiveName) {
    this.accountDescriptiveName = accountDescriptiveName;
  }

  public String getAccountTimeZone() {
    return accountTimeZone;
  }

  public void setAccountTimeZone(String accountTimeZone) {
    this.accountTimeZone = accountTimeZone;
  }

  public Long getBaseCampaignId() {
    return baseCampaignId;
  }

  public void setBaseCampaignId(Long baseCampaignId) {
    this.baseCampaignId = baseCampaignId;
  }

  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public String getCampaignStatus() {
    return campaignStatus;
  }

  public void setCampaignStatus(String campaignStatus) {
    this.campaignStatus = campaignStatus;
  }

  public String getCriteria() {
    return criteria;
  }

  public void setCriteria(String criteria) {
    this.criteria = criteria;
  }

  public String getCustomerDescriptiveName() {
    return customerDescriptiveName;
  }

  public void setCustomerDescriptiveName(String customerDescriptiveName) {
    this.customerDescriptiveName = customerDescriptiveName;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getIsNegative() {
    return isNegative;
  }

  public void setIsNegative(String isNegative) {
    this.isNegative = isNegative;
  }

  public String getKeywordMatchType() {
    return keywordMatchType;
  }

  public void setKeywordMatchType(String keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
  }

  @Override
  public void setRowId() {
    // General fields for generating unique id.
    StringBuilder idBuilder = new StringBuilder(getCustomerId().toString());
    if (campaignId != null) {
      idBuilder.append("-").append(campaignId);
    }
    if (id != null) {
      idBuilder.append("-").append(id);
    }
    if (!StringUtils.isEmpty(keywordMatchType)) {
      idBuilder.append("-").append(keywordMatchType);
    }

    // Include all segmentation fields (if set).
    this.rowId = idBuilder.toString();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) { return false; }
    if (obj == this) { return true; }
    if (obj.getClass() != getClass()) { return false; }
    CampaignNegativeKeywordsPerformanceReport other = (CampaignNegativeKeywordsPerformanceReport) obj;
    return new EqualsBuilder()
      .appendSuper(super.equals(obj))
      .append(accountCurrencyCode, other.accountCurrencyCode)
      .append(accountDescriptiveName, other.accountDescriptiveName)
      .append(accountTimeZone, other.accountTimeZone)
      .append(baseCampaignId, other.baseCampaignId)
      .append(campaignId, other.campaignId)
      .append(campaignName, other.campaignName)
      .append(campaignStatus, other.campaignStatus)
      .append(criteria, other.criteria)
      .append(customerDescriptiveName, other.customerDescriptiveName)
      .append(id, other.id)
      .append(isNegative, other.isNegative)
      .append(keywordMatchType, other.keywordMatchType)
      .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
      .appendSuper(super.hashCode())
      .append(accountCurrencyCode)
      .append(accountDescriptiveName)
      .append(accountTimeZone)
      .append(baseCampaignId)
      .append(campaignId)
      .append(campaignName)
      .append(campaignStatus)
      .append(criteria)
      .append(customerDescriptiveName)
      .append(id)
      .append(isNegative)
      .append(keywordMatchType)
      .toHashCode();
  }

}
