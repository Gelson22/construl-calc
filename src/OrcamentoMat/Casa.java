package OrcamentoMat;

import java.util.ArrayList;
import java.util.List;

public class Casa {
	private double largura ;
	private double comprimento;
	/*criação de uma constante */
	
	public static final int cmMetro=10000;
	
	
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	/*calcular perimetro da casa  */
	
	
	
	public double  calcPerimetro() {
    
		return (largura+ comprimento)*2  ;
	}
	
	public double calcArea() {
		return largura * comprimento ;
	}
	
	/*calcular metragens de paredes */
	
	private Parede parede=new Parede();
	
	
	public Parede getParede() {
		return parede;
	}
	public void setParede(Parede parede) {
		this.parede = parede;
	}
	public double metroParede() {
		
		return calcPerimetro() * parede.getAlturaP();
	}
	
	/*converter metragem de paredes  para cm */
	
	public double cmParede() {
		return metroParede()* cmMetro;
		
	}
	
	
	 
	/*criando as listas de materiais para construir as paredes*/
	
	private List<BlocoCeramico> blocosCeramicos=new ArrayList<BlocoCeramico>();
    
	private List<BlocoConcreto> blocosConcreto=new ArrayList<BlocoConcreto>();
	
	private List<TijoloComun> tijloscomuns=new ArrayList<TijoloComun>();
	
	public List<BlocoCeramico> getBlocosCeramicos() {
		return blocosCeramicos;
	}
	public void setBlocosCeramicos(List<BlocoCeramico> blocosCeramicos) {
		this.blocosCeramicos = blocosCeramicos;
		
	}
	public List<BlocoConcreto> getBlocosConcreto() {
		return blocosConcreto;
	}
	public void setBlocosConcreto(List<BlocoConcreto> blocosConcreto) {
		this.blocosConcreto = blocosConcreto;
	}
	public List<TijoloComun> getTijloscomuns() {
		return tijloscomuns;
	}
	public void setTijloscomuns(List<TijoloComun> tijloscomuns) {
		this.tijloscomuns = tijloscomuns;
	}
    
    
    
}
