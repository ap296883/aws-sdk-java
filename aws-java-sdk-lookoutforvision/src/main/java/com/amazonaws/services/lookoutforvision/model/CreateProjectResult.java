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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the project.
     * </p>
     */
    private ProjectMetadata projectMetadata;

    /**
     * <p>
     * Information about the project.
     * </p>
     * 
     * @param projectMetadata
     *        Information about the project.
     */

    public void setProjectMetadata(ProjectMetadata projectMetadata) {
        this.projectMetadata = projectMetadata;
    }

    /**
     * <p>
     * Information about the project.
     * </p>
     * 
     * @return Information about the project.
     */

    public ProjectMetadata getProjectMetadata() {
        return this.projectMetadata;
    }

    /**
     * <p>
     * Information about the project.
     * </p>
     * 
     * @param projectMetadata
     *        Information about the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectResult withProjectMetadata(ProjectMetadata projectMetadata) {
        setProjectMetadata(projectMetadata);
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
        if (getProjectMetadata() != null)
            sb.append("ProjectMetadata: ").append(getProjectMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectResult == false)
            return false;
        CreateProjectResult other = (CreateProjectResult) obj;
        if (other.getProjectMetadata() == null ^ this.getProjectMetadata() == null)
            return false;
        if (other.getProjectMetadata() != null && other.getProjectMetadata().equals(this.getProjectMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectMetadata() == null) ? 0 : getProjectMetadata().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectResult clone() {
        try {
            return (CreateProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
