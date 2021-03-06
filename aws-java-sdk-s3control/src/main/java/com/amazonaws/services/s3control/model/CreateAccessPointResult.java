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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessPointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the access point.
     * </p>
     * <note>
     * <p>
     * This is only supported by Amazon S3 on Outposts.
     * </p>
     * </note>
     */
    private String accessPointArn;

    /**
     * <p>
     * The ARN of the access point.
     * </p>
     * <note>
     * <p>
     * This is only supported by Amazon S3 on Outposts.
     * </p>
     * </note>
     * 
     * @param accessPointArn
     *        The ARN of the access point.</p> <note>
     *        <p>
     *        This is only supported by Amazon S3 on Outposts.
     *        </p>
     */

    public void setAccessPointArn(String accessPointArn) {
        this.accessPointArn = accessPointArn;
    }

    /**
     * <p>
     * The ARN of the access point.
     * </p>
     * <note>
     * <p>
     * This is only supported by Amazon S3 on Outposts.
     * </p>
     * </note>
     * 
     * @return The ARN of the access point.</p> <note>
     *         <p>
     *         This is only supported by Amazon S3 on Outposts.
     *         </p>
     */

    public String getAccessPointArn() {
        return this.accessPointArn;
    }

    /**
     * <p>
     * The ARN of the access point.
     * </p>
     * <note>
     * <p>
     * This is only supported by Amazon S3 on Outposts.
     * </p>
     * </note>
     * 
     * @param accessPointArn
     *        The ARN of the access point.</p> <note>
     *        <p>
     *        This is only supported by Amazon S3 on Outposts.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointResult withAccessPointArn(String accessPointArn) {
        setAccessPointArn(accessPointArn);
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
        if (getAccessPointArn() != null)
            sb.append("AccessPointArn: ").append(getAccessPointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessPointResult == false)
            return false;
        CreateAccessPointResult other = (CreateAccessPointResult) obj;
        if (other.getAccessPointArn() == null ^ this.getAccessPointArn() == null)
            return false;
        if (other.getAccessPointArn() != null && other.getAccessPointArn().equals(this.getAccessPointArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPointArn() == null) ? 0 : getAccessPointArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessPointResult clone() {
        try {
            return (CreateAccessPointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
