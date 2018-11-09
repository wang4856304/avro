/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.wj.entity;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class MemberShip extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2113946784464673719L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MemberShip\",\"namespace\":\"com.wj.entity\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"default\":\"member_id\"},{\"name\":\"displayName\",\"type\":\"string\"},{\"name\":\"description\",\"type\":\"string\"},{\"name\":\"data_type\",\"type\":\"string\"},{\"name\":\"default\",\"type\":\"string\"},{\"name\":\"read_only\",\"type\":\"boolean\"},{\"name\":\"nullable\",\"type\":\"boolean\"},{\"name\":\"derived\",\"type\":\"boolean\"},{\"name\":\"expression\",\"type\":\"string\"},{\"name\":\"source\",\"type\":\"string\"},{\"name\":\"source_column\",\"type\":\"string\"},{\"name\":\"api_logic\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence displayName;
  @Deprecated public java.lang.CharSequence description;
  @Deprecated public java.lang.CharSequence data_type;
  @Deprecated public java.lang.CharSequence default$;
  @Deprecated public boolean read_only;
  @Deprecated public boolean nullable;
  @Deprecated public boolean derived;
  @Deprecated public java.lang.CharSequence expression;
  @Deprecated public java.lang.CharSequence source;
  @Deprecated public java.lang.CharSequence source_column;
  @Deprecated public java.lang.CharSequence api_logic;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MemberShip() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param displayName The new value for displayName
   * @param description The new value for description
   * @param data_type The new value for data_type
   * @param default$ The new value for default
   * @param read_only The new value for read_only
   * @param nullable The new value for nullable
   * @param derived The new value for derived
   * @param expression The new value for expression
   * @param source The new value for source
   * @param source_column The new value for source_column
   * @param api_logic The new value for api_logic
   */
  public MemberShip(java.lang.CharSequence name, java.lang.CharSequence displayName, java.lang.CharSequence description, java.lang.CharSequence data_type, java.lang.CharSequence default$, java.lang.Boolean read_only, java.lang.Boolean nullable, java.lang.Boolean derived, java.lang.CharSequence expression, java.lang.CharSequence source, java.lang.CharSequence source_column, java.lang.CharSequence api_logic) {
    this.name = name;
    this.displayName = displayName;
    this.description = description;
    this.data_type = data_type;
    this.default$ = default$;
    this.read_only = read_only;
    this.nullable = nullable;
    this.derived = derived;
    this.expression = expression;
    this.source = source;
    this.source_column = source_column;
    this.api_logic = api_logic;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return displayName;
    case 2: return description;
    case 3: return data_type;
    case 4: return default$;
    case 5: return read_only;
    case 6: return nullable;
    case 7: return derived;
    case 8: return expression;
    case 9: return source;
    case 10: return source_column;
    case 11: return api_logic;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: displayName = (java.lang.CharSequence)value$; break;
    case 2: description = (java.lang.CharSequence)value$; break;
    case 3: data_type = (java.lang.CharSequence)value$; break;
    case 4: default$ = (java.lang.CharSequence)value$; break;
    case 5: read_only = (java.lang.Boolean)value$; break;
    case 6: nullable = (java.lang.Boolean)value$; break;
    case 7: derived = (java.lang.Boolean)value$; break;
    case 8: expression = (java.lang.CharSequence)value$; break;
    case 9: source = (java.lang.CharSequence)value$; break;
    case 10: source_column = (java.lang.CharSequence)value$; break;
    case 11: api_logic = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'displayName' field.
   * @return The value of the 'displayName' field.
   */
  public java.lang.CharSequence getDisplayName() {
    return displayName;
  }

  /**
   * Sets the value of the 'displayName' field.
   * @param value the value to set.
   */
  public void setDisplayName(java.lang.CharSequence value) {
    this.displayName = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'data_type' field.
   * @return The value of the 'data_type' field.
   */
  public java.lang.CharSequence getDataType() {
    return data_type;
  }

  /**
   * Sets the value of the 'data_type' field.
   * @param value the value to set.
   */
  public void setDataType(java.lang.CharSequence value) {
    this.data_type = value;
  }

  /**
   * Gets the value of the 'default$' field.
   * @return The value of the 'default$' field.
   */
  public java.lang.CharSequence getDefault$() {
    return default$;
  }

  /**
   * Sets the value of the 'default$' field.
   * @param value the value to set.
   */
  public void setDefault$(java.lang.CharSequence value) {
    this.default$ = value;
  }

  /**
   * Gets the value of the 'read_only' field.
   * @return The value of the 'read_only' field.
   */
  public java.lang.Boolean getReadOnly() {
    return read_only;
  }

  /**
   * Sets the value of the 'read_only' field.
   * @param value the value to set.
   */
  public void setReadOnly(java.lang.Boolean value) {
    this.read_only = value;
  }

  /**
   * Gets the value of the 'nullable' field.
   * @return The value of the 'nullable' field.
   */
  public java.lang.Boolean getNullable() {
    return nullable;
  }

  /**
   * Sets the value of the 'nullable' field.
   * @param value the value to set.
   */
  public void setNullable(java.lang.Boolean value) {
    this.nullable = value;
  }

  /**
   * Gets the value of the 'derived' field.
   * @return The value of the 'derived' field.
   */
  public java.lang.Boolean getDerived() {
    return derived;
  }

  /**
   * Sets the value of the 'derived' field.
   * @param value the value to set.
   */
  public void setDerived(java.lang.Boolean value) {
    this.derived = value;
  }

  /**
   * Gets the value of the 'expression' field.
   * @return The value of the 'expression' field.
   */
  public java.lang.CharSequence getExpression() {
    return expression;
  }

  /**
   * Sets the value of the 'expression' field.
   * @param value the value to set.
   */
  public void setExpression(java.lang.CharSequence value) {
    this.expression = value;
  }

  /**
   * Gets the value of the 'source' field.
   * @return The value of the 'source' field.
   */
  public java.lang.CharSequence getSource() {
    return source;
  }

  /**
   * Sets the value of the 'source' field.
   * @param value the value to set.
   */
  public void setSource(java.lang.CharSequence value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'source_column' field.
   * @return The value of the 'source_column' field.
   */
  public java.lang.CharSequence getSourceColumn() {
    return source_column;
  }

  /**
   * Sets the value of the 'source_column' field.
   * @param value the value to set.
   */
  public void setSourceColumn(java.lang.CharSequence value) {
    this.source_column = value;
  }

  /**
   * Gets the value of the 'api_logic' field.
   * @return The value of the 'api_logic' field.
   */
  public java.lang.CharSequence getApiLogic() {
    return api_logic;
  }

  /**
   * Sets the value of the 'api_logic' field.
   * @param value the value to set.
   */
  public void setApiLogic(java.lang.CharSequence value) {
    this.api_logic = value;
  }

  /**
   * Creates a new MemberShip RecordBuilder.
   * @return A new MemberShip RecordBuilder
   */
  public static com.wj.entity.MemberShip.Builder newBuilder() {
    return new com.wj.entity.MemberShip.Builder();
  }

  /**
   * Creates a new MemberShip RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MemberShip RecordBuilder
   */
  public static com.wj.entity.MemberShip.Builder newBuilder(com.wj.entity.MemberShip.Builder other) {
    return new com.wj.entity.MemberShip.Builder(other);
  }

  /**
   * Creates a new MemberShip RecordBuilder by copying an existing MemberShip instance.
   * @param other The existing instance to copy.
   * @return A new MemberShip RecordBuilder
   */
  public static com.wj.entity.MemberShip.Builder newBuilder(com.wj.entity.MemberShip other) {
    return new com.wj.entity.MemberShip.Builder(other);
  }

  /**
   * RecordBuilder for MemberShip instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MemberShip>
    implements org.apache.avro.data.RecordBuilder<MemberShip> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence displayName;
    private java.lang.CharSequence description;
    private java.lang.CharSequence data_type;
    private java.lang.CharSequence default$;
    private boolean read_only;
    private boolean nullable;
    private boolean derived;
    private java.lang.CharSequence expression;
    private java.lang.CharSequence source;
    private java.lang.CharSequence source_column;
    private java.lang.CharSequence api_logic;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.wj.entity.MemberShip.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.displayName)) {
        this.displayName = data().deepCopy(fields()[1].schema(), other.displayName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.data_type)) {
        this.data_type = data().deepCopy(fields()[3].schema(), other.data_type);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.default$)) {
        this.default$ = data().deepCopy(fields()[4].schema(), other.default$);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.read_only)) {
        this.read_only = data().deepCopy(fields()[5].schema(), other.read_only);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.nullable)) {
        this.nullable = data().deepCopy(fields()[6].schema(), other.nullable);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.derived)) {
        this.derived = data().deepCopy(fields()[7].schema(), other.derived);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.expression)) {
        this.expression = data().deepCopy(fields()[8].schema(), other.expression);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.source)) {
        this.source = data().deepCopy(fields()[9].schema(), other.source);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.source_column)) {
        this.source_column = data().deepCopy(fields()[10].schema(), other.source_column);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.api_logic)) {
        this.api_logic = data().deepCopy(fields()[11].schema(), other.api_logic);
        fieldSetFlags()[11] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing MemberShip instance
     * @param other The existing instance to copy.
     */
    private Builder(com.wj.entity.MemberShip other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.displayName)) {
        this.displayName = data().deepCopy(fields()[1].schema(), other.displayName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.data_type)) {
        this.data_type = data().deepCopy(fields()[3].schema(), other.data_type);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.default$)) {
        this.default$ = data().deepCopy(fields()[4].schema(), other.default$);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.read_only)) {
        this.read_only = data().deepCopy(fields()[5].schema(), other.read_only);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.nullable)) {
        this.nullable = data().deepCopy(fields()[6].schema(), other.nullable);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.derived)) {
        this.derived = data().deepCopy(fields()[7].schema(), other.derived);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.expression)) {
        this.expression = data().deepCopy(fields()[8].schema(), other.expression);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.source)) {
        this.source = data().deepCopy(fields()[9].schema(), other.source);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.source_column)) {
        this.source_column = data().deepCopy(fields()[10].schema(), other.source_column);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.api_logic)) {
        this.api_logic = data().deepCopy(fields()[11].schema(), other.api_logic);
        fieldSetFlags()[11] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'displayName' field.
      * @return The value.
      */
    public java.lang.CharSequence getDisplayName() {
      return displayName;
    }

    /**
      * Sets the value of the 'displayName' field.
      * @param value The value of 'displayName'.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder setDisplayName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.displayName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'displayName' field has been set.
      * @return True if the 'displayName' field has been set, false otherwise.
      */
    public boolean hasDisplayName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'displayName' field.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder clearDisplayName() {
      displayName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.CharSequence getDescription() {
      return description;
    }

    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'data_type' field.
      * @return The value.
      */
    public java.lang.CharSequence getDataType() {
      return data_type;
    }

    /**
      * Sets the value of the 'data_type' field.
      * @param value The value of 'data_type'.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder setDataType(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.data_type = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'data_type' field has been set.
      * @return True if the 'data_type' field has been set, false otherwise.
      */
    public boolean hasDataType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'data_type' field.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder clearDataType() {
      data_type = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'default$' field.
      * @return The value.
      */
    public java.lang.CharSequence getDefault$() {
      return default$;
    }

    /**
      * Sets the value of the 'default$' field.
      * @param value The value of 'default$'.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder setDefault$(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.default$ = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'default$' field has been set.
      * @return True if the 'default$' field has been set, false otherwise.
      */
    public boolean hasDefault$() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'default$' field.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder clearDefault$() {
      default$ = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'read_only' field.
      * @return The value.
      */
    public java.lang.Boolean getReadOnly() {
      return read_only;
    }

    /**
      * Sets the value of the 'read_only' field.
      * @param value The value of 'read_only'.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder setReadOnly(boolean value) {
      validate(fields()[5], value);
      this.read_only = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'read_only' field has been set.
      * @return True if the 'read_only' field has been set, false otherwise.
      */
    public boolean hasReadOnly() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'read_only' field.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder clearReadOnly() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'nullable' field.
      * @return The value.
      */
    public java.lang.Boolean getNullable() {
      return nullable;
    }

    /**
      * Sets the value of the 'nullable' field.
      * @param value The value of 'nullable'.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder setNullable(boolean value) {
      validate(fields()[6], value);
      this.nullable = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'nullable' field has been set.
      * @return True if the 'nullable' field has been set, false otherwise.
      */
    public boolean hasNullable() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'nullable' field.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder clearNullable() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'derived' field.
      * @return The value.
      */
    public java.lang.Boolean getDerived() {
      return derived;
    }

    /**
      * Sets the value of the 'derived' field.
      * @param value The value of 'derived'.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder setDerived(boolean value) {
      validate(fields()[7], value);
      this.derived = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'derived' field has been set.
      * @return True if the 'derived' field has been set, false otherwise.
      */
    public boolean hasDerived() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'derived' field.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder clearDerived() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'expression' field.
      * @return The value.
      */
    public java.lang.CharSequence getExpression() {
      return expression;
    }

    /**
      * Sets the value of the 'expression' field.
      * @param value The value of 'expression'.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder setExpression(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.expression = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'expression' field has been set.
      * @return True if the 'expression' field has been set, false otherwise.
      */
    public boolean hasExpression() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'expression' field.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder clearExpression() {
      expression = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'source' field.
      * @return The value.
      */
    public java.lang.CharSequence getSource() {
      return source;
    }

    /**
      * Sets the value of the 'source' field.
      * @param value The value of 'source'.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder setSource(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.source = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'source' field has been set.
      * @return True if the 'source' field has been set, false otherwise.
      */
    public boolean hasSource() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'source' field.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder clearSource() {
      source = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'source_column' field.
      * @return The value.
      */
    public java.lang.CharSequence getSourceColumn() {
      return source_column;
    }

    /**
      * Sets the value of the 'source_column' field.
      * @param value The value of 'source_column'.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder setSourceColumn(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.source_column = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'source_column' field has been set.
      * @return True if the 'source_column' field has been set, false otherwise.
      */
    public boolean hasSourceColumn() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'source_column' field.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder clearSourceColumn() {
      source_column = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'api_logic' field.
      * @return The value.
      */
    public java.lang.CharSequence getApiLogic() {
      return api_logic;
    }

    /**
      * Sets the value of the 'api_logic' field.
      * @param value The value of 'api_logic'.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder setApiLogic(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.api_logic = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'api_logic' field has been set.
      * @return True if the 'api_logic' field has been set, false otherwise.
      */
    public boolean hasApiLogic() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'api_logic' field.
      * @return This builder.
      */
    public com.wj.entity.MemberShip.Builder clearApiLogic() {
      api_logic = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    public MemberShip build() {
      try {
        MemberShip record = new MemberShip();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.displayName = fieldSetFlags()[1] ? this.displayName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.data_type = fieldSetFlags()[3] ? this.data_type : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.default$ = fieldSetFlags()[4] ? this.default$ : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.read_only = fieldSetFlags()[5] ? this.read_only : (java.lang.Boolean) defaultValue(fields()[5]);
        record.nullable = fieldSetFlags()[6] ? this.nullable : (java.lang.Boolean) defaultValue(fields()[6]);
        record.derived = fieldSetFlags()[7] ? this.derived : (java.lang.Boolean) defaultValue(fields()[7]);
        record.expression = fieldSetFlags()[8] ? this.expression : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.source = fieldSetFlags()[9] ? this.source : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.source_column = fieldSetFlags()[10] ? this.source_column : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.api_logic = fieldSetFlags()[11] ? this.api_logic : (java.lang.CharSequence) defaultValue(fields()[11]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}