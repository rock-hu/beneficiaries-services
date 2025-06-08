package com.openbanking.beneficiaries.model;

/**
 * Specifies the Beneficiary Type.
 */
public enum OBBeneficiaryType1Code {
	TRUSTED("Trusted"), ORDINARY("Ordinary");

	private String value;

	OBBeneficiaryType1Code(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static OBBeneficiaryType1Code fromValue(String text) {
		for (OBBeneficiaryType1Code b : OBBeneficiaryType1Code.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
