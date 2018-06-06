
package generated.clientserviceExemplaire;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour edition complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="edition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anneeEdition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idOuvrage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ouvrage" type="{http://services.webservice.ocp4.com/}ouvrage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edition", propOrder = {
    "anneeEdition",
    "editeur",
    "format",
    "idOuvrage",
    "isbn",
    "ouvrage"
})
public class Edition {

    protected String anneeEdition;
    protected String editeur;
    protected String format;
    protected Integer idOuvrage;
    protected String isbn;
    protected Ouvrage ouvrage;

    /**
     * Obtient la valeur de la propri�t� anneeEdition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnneeEdition() {
        return anneeEdition;
    }

    /**
     * D�finit la valeur de la propri�t� anneeEdition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnneeEdition(String value) {
        this.anneeEdition = value;
    }

    /**
     * Obtient la valeur de la propri�t� editeur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditeur() {
        return editeur;
    }

    /**
     * D�finit la valeur de la propri�t� editeur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditeur(String value) {
        this.editeur = value;
    }

    /**
     * Obtient la valeur de la propri�t� format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * D�finit la valeur de la propri�t� format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Obtient la valeur de la propri�t� idOuvrage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOuvrage() {
        return idOuvrage;
    }

    /**
     * D�finit la valeur de la propri�t� idOuvrage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOuvrage(Integer value) {
        this.idOuvrage = value;
    }

    /**
     * Obtient la valeur de la propri�t� isbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * D�finit la valeur de la propri�t� isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Obtient la valeur de la propri�t� ouvrage.
     * 
     * @return
     *     possible object is
     *     {@link Ouvrage }
     *     
     */
    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    /**
     * D�finit la valeur de la propri�t� ouvrage.
     * 
     * @param value
     *     allowed object is
     *     {@link Ouvrage }
     *     
     */
    public void setOuvrage(Ouvrage value) {
        this.ouvrage = value;
    }

}
