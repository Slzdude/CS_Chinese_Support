package aggressor.ui;

import aggressor.Prefs;
import de.javasoft.plaf.synthetica.SyntheticaLookAndFeel;
import java.awt.Font;
import javax.swing.UIManager;

public class UseSynthetica extends UseLookAndFeel {
    public UseSynthetica() {
    }

    public void setup() {
        try {
            SyntheticaLookAndFeel.setWindowsDecorated(false);
            set("Synthetica.extendedFileChooser.rememberPreferences", false);
            set("Synthetica.font.enabled", true);
            set("Synthetica.text.antialias", false);
            set("Synthetica.textArea.border.opaqueBackground", false);
            set("Synthetica.font.respectSystemDPI", false);
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel");
            SyntheticaLookAndFeel.setFont("Microsoft YaHei UI", 12);
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    static {
        String[] li = new String[]{"Licensee=Strategic Cyber LLC", "LicenseRegistrationNumber=404478475", "Product=Synthetica", "LicenseType=Small Business License", "ExpireDate=--.--.----", "MaxVersion=2.30.999"};
        UIManager.put("Synthetica.license.info", li);
        UIManager.put("Synthetica.license.key", "D6363B2A-F83CD00A-C4EB6105-31B2770B");
    }
}
