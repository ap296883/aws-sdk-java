/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCertificates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCertificatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that describes certificates.
     * </p>
     */
    private java.util.List<CertificateSummary> certificates;

    /**
     * <p>
     * An object that describes certificates.
     * </p>
     * 
     * @return An object that describes certificates.
     */

    public java.util.List<CertificateSummary> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * An object that describes certificates.
     * </p>
     * 
     * @param certificates
     *        An object that describes certificates.
     */

    public void setCertificates(java.util.Collection<CertificateSummary> certificates) {
        if (certificates == null) {
            this.certificates = null;
            return;
        }

        this.certificates = new java.util.ArrayList<CertificateSummary>(certificates);
    }

    /**
     * <p>
     * An object that describes certificates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificates(java.util.Collection)} or {@link #withCertificates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificates
     *        An object that describes certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCertificatesResult withCertificates(CertificateSummary... certificates) {
        if (this.certificates == null) {
            setCertificates(new java.util.ArrayList<CertificateSummary>(certificates.length));
        }
        for (CertificateSummary ele : certificates) {
            this.certificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that describes certificates.
     * </p>
     * 
     * @param certificates
     *        An object that describes certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCertificatesResult withCertificates(java.util.Collection<CertificateSummary> certificates) {
        setCertificates(certificates);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCertificates() != null)
            sb.append("Certificates: ").append(getCertificates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCertificatesResult == false)
            return false;
        GetCertificatesResult other = (GetCertificatesResult) obj;
        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        return hashCode;
    }

    @Override
    public GetCertificatesResult clone() {
        try {
            return (GetCertificatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
