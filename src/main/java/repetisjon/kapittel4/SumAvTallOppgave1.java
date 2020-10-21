/** programliste 4.4
 *Oppgave 4.9 oppgave 1
 * Da har jeg forstått hva hun mener, nå blir ikke sum nullet ut på nytt for hvert omløp av hoved iterasjonen
 * men blir med videre i bergningen da som ikke blir resatt til 0 før indre løkke starter.
 */
package repetisjon.kapittel4;

public class SumAvTallOppgave1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int linjeTeller = 0; linjeTeller < 10; linjeTeller++){
            for (int tall = 1; tall <=linjeTeller; tall++){
                sum += tall;
                System.out.print(tall +" ");
                }
            System.out.println("Summen av hver linje blir "+sum );
            }
        }
    }