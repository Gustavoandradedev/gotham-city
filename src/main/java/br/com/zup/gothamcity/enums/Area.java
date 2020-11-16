package br.com.zup.gothamcity.enums;

public enum Area {

	ESPORTE("esporte"), TRANSITO("transito"), SAUDE("saude"), OBRAS("obras"), EDUCACAO("educacao"),
	SEGURANCA("seguranca"), CULTURA("cultura"), AMBIENTE("ambiente"), RURAL("rural");

	private String setor;

	Area(String setor) {
		this.setor = setor;
	}

	public String getValue() {
		return setor;
	}
	@Override
    public String toString() {
        return this.setor;
    }

}
