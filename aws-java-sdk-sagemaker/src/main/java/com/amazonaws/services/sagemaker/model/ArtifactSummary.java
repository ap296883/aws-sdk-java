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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists a summary of the properties of an artifact. An artifact represents a URI addressable object or data. Some
 * examples are a dataset and a model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ArtifactSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArtifactSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact.
     * </p>
     */
    private String artifactArn;
    /**
     * <p>
     * The name of the artifact.
     * </p>
     */
    private String artifactName;
    /**
     * <p>
     * The source of the artifact.
     * </p>
     */
    private ArtifactSource source;
    /**
     * <p>
     * The type of the artifact.
     * </p>
     */
    private String artifactType;
    /**
     * <p>
     * When the artifact was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When the artifact was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact.
     * </p>
     * 
     * @param artifactArn
     *        The Amazon Resource Name (ARN) of the artifact.
     */

    public void setArtifactArn(String artifactArn) {
        this.artifactArn = artifactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the artifact.
     */

    public String getArtifactArn() {
        return this.artifactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact.
     * </p>
     * 
     * @param artifactArn
     *        The Amazon Resource Name (ARN) of the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactSummary withArtifactArn(String artifactArn) {
        setArtifactArn(artifactArn);
        return this;
    }

    /**
     * <p>
     * The name of the artifact.
     * </p>
     * 
     * @param artifactName
     *        The name of the artifact.
     */

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    /**
     * <p>
     * The name of the artifact.
     * </p>
     * 
     * @return The name of the artifact.
     */

    public String getArtifactName() {
        return this.artifactName;
    }

    /**
     * <p>
     * The name of the artifact.
     * </p>
     * 
     * @param artifactName
     *        The name of the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactSummary withArtifactName(String artifactName) {
        setArtifactName(artifactName);
        return this;
    }

    /**
     * <p>
     * The source of the artifact.
     * </p>
     * 
     * @param source
     *        The source of the artifact.
     */

    public void setSource(ArtifactSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the artifact.
     * </p>
     * 
     * @return The source of the artifact.
     */

    public ArtifactSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the artifact.
     * </p>
     * 
     * @param source
     *        The source of the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactSummary withSource(ArtifactSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The type of the artifact.
     * </p>
     * 
     * @param artifactType
     *        The type of the artifact.
     */

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    /**
     * <p>
     * The type of the artifact.
     * </p>
     * 
     * @return The type of the artifact.
     */

    public String getArtifactType() {
        return this.artifactType;
    }

    /**
     * <p>
     * The type of the artifact.
     * </p>
     * 
     * @param artifactType
     *        The type of the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactSummary withArtifactType(String artifactType) {
        setArtifactType(artifactType);
        return this;
    }

    /**
     * <p>
     * When the artifact was created.
     * </p>
     * 
     * @param creationTime
     *        When the artifact was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the artifact was created.
     * </p>
     * 
     * @return When the artifact was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the artifact was created.
     * </p>
     * 
     * @param creationTime
     *        When the artifact was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the artifact was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the artifact was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the artifact was last modified.
     * </p>
     * 
     * @return When the artifact was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the artifact was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the artifact was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getArtifactArn() != null)
            sb.append("ArtifactArn: ").append(getArtifactArn()).append(",");
        if (getArtifactName() != null)
            sb.append("ArtifactName: ").append(getArtifactName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getArtifactType() != null)
            sb.append("ArtifactType: ").append(getArtifactType()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArtifactSummary == false)
            return false;
        ArtifactSummary other = (ArtifactSummary) obj;
        if (other.getArtifactArn() == null ^ this.getArtifactArn() == null)
            return false;
        if (other.getArtifactArn() != null && other.getArtifactArn().equals(this.getArtifactArn()) == false)
            return false;
        if (other.getArtifactName() == null ^ this.getArtifactName() == null)
            return false;
        if (other.getArtifactName() != null && other.getArtifactName().equals(this.getArtifactName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getArtifactType() == null ^ this.getArtifactType() == null)
            return false;
        if (other.getArtifactType() != null && other.getArtifactType().equals(this.getArtifactType()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactArn() == null) ? 0 : getArtifactArn().hashCode());
        hashCode = prime * hashCode + ((getArtifactName() == null) ? 0 : getArtifactName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getArtifactType() == null) ? 0 : getArtifactType().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public ArtifactSummary clone() {
        try {
            return (ArtifactSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ArtifactSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
