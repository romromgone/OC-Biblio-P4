
package generated.clientserviceEmprunt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour emprunt complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="emprunt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exemplaire" type="{http://services.webservice.ocp4.com/}exemplaire" minOccurs="0"/>
 *         &lt;element name="idExemplaire" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mailUsager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prolonge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rendu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="usager" type="{http://services.webservice.ocp4.com/}usager" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emprunt", propOrder = {
    "dateDeb",
    "dateFin",
    "exemplaire",
    "idExemplaire",
    "mailUsager",
    "prolonge",
    "rendu",
    "usager"
})
public class Emprunt {

    protected String dateDeb;
    protected String dateFin;
    protected Exemplaire exemplaire;
    protected Integer idExemplaire;
    protected String mailUsager;
    protected Boolean prolonge;
    protected Boolean rendu;
    protected Usager usager;

    /**
     * Obtient la valeur de la propri�t� dateDeb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDeb() {
        return dateDeb;
    }

    /**
     * D�finit la valeur de la propri�t� dateDeb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDeb(String value) {
        this.dateDeb = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFin() {
        return dateFin;
    }

    /**
     * D�finit la valeur de la propri�t� dateFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFin(String value) {
        this.dateFin = value;
    }

    /**
     * Obtient la valeur de la propri�t� exemplaire.
     * 
     * @return
     *     possible object is
     *     {@link Exemplaire }
     *     
     */
    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    /**
     * D�finit la valeur de la propri�t� exemplaire.
     * 
     * @param value
     *     allowed object is
     *     {@link Exemplaire }
     *     
     */
    public void setExemplaire(Exemplaire value) {
        this.exemplaire = value;
    }

    /**
     * Obtient la valeur de la propri�t� idExemplaire.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdExemplaire() {
        return idExemplaire;
    }

    /**
     * D�finit la valeur de la propri�t� idExemplaire.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdExemplaire(Integer value) {
        this.idExemplaire = value;
    }

    /**
     * Obtient la valeur de la propri�t� mailUsager.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailUsager() {
        return mailUsager;
    }

    /**
     * D�finit la valeur de la propri�t� mailUsager.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailUsager(String value) {
        this.mailUsager = value;
    }

    /**
     * Obtient la valeur de la propri�t� prolonge.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProlonge() {
        return prolonge;
    }

    /**
     * D�finit la valeur de la propri�t� prolonge.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProlonge(Boolean value) {
        this.prolonge = value;
    }

    /**
     * Obtient la valeur de la propri�t� rendu.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRendu() {
        return rendu;
    }

    /**
     * D�finit la valeur de la propri�t� rendu.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRendu(Boolean value) {
        this.rendu = value;
    }

    /**
     * Obtient la valeur de la propri�t� usager.
     * 
     * @return
     *     possible object is
     *     {@link Usager }
     *     
     */
    public Usager getUsager() {
        return usager;
    }

    /**
     * D�finit la valeur de la propri�t� usager.
     * 
     * @param value
     *     allowed object is
     *     {@link Usager }
     *     
     */
    public void setUsager(Usager value) {
        this.usager = value;
    }

}
