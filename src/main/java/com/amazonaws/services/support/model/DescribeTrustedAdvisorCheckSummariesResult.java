/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the following objects or data if successful. Otherwise, returns an error.
 * </p>
 */
public class DescribeTrustedAdvisorCheckSummariesResult implements Serializable {

    /**
     * The summary information for the requested Trusted Advisor checks.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckSummary> summaries;

    /**
     * The summary information for the requested Trusted Advisor checks.
     *
     * @return The summary information for the requested Trusted Advisor checks.
     */
    public java.util.List<TrustedAdvisorCheckSummary> getSummaries() {
        if (summaries == null) {
              summaries = new com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckSummary>();
              summaries.setAutoConstruct(true);
        }
        return summaries;
    }
    
    /**
     * The summary information for the requested Trusted Advisor checks.
     *
     * @param summaries The summary information for the requested Trusted Advisor checks.
     */
    public void setSummaries(java.util.Collection<TrustedAdvisorCheckSummary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckSummary> summariesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckSummary>(summaries.size());
        summariesCopy.addAll(summaries);
        this.summaries = summariesCopy;
    }
    
    /**
     * The summary information for the requested Trusted Advisor checks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param summaries The summary information for the requested Trusted Advisor checks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTrustedAdvisorCheckSummariesResult withSummaries(TrustedAdvisorCheckSummary... summaries) {
        if (getSummaries() == null) setSummaries(new java.util.ArrayList<TrustedAdvisorCheckSummary>(summaries.length));
        for (TrustedAdvisorCheckSummary value : summaries) {
            getSummaries().add(value);
        }
        return this;
    }
    
    /**
     * The summary information for the requested Trusted Advisor checks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param summaries The summary information for the requested Trusted Advisor checks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTrustedAdvisorCheckSummariesResult withSummaries(java.util.Collection<TrustedAdvisorCheckSummary> summaries) {
        if (summaries == null) {
            this.summaries = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckSummary> summariesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckSummary>(summaries.size());
            summariesCopy.addAll(summaries);
            this.summaries = summariesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSummaries() != null) sb.append("Summaries: " + getSummaries() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSummaries() == null) ? 0 : getSummaries().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTrustedAdvisorCheckSummariesResult == false) return false;
        DescribeTrustedAdvisorCheckSummariesResult other = (DescribeTrustedAdvisorCheckSummariesResult)obj;
        
        if (other.getSummaries() == null ^ this.getSummaries() == null) return false;
        if (other.getSummaries() != null && other.getSummaries().equals(this.getSummaries()) == false) return false; 
        return true;
    }
    
}
    