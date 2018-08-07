/*
 * Copyright 2013 David Kunzler
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package de.devland.esperandro; /*
 * Copyright 2013 David Kunzler
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

 
import de.devland.esperandro.tests.EsperandroSimpleExample; 
import junit.framework.Assert; 
import org.junit.Test; 
import org.junit.runner.RunWith; 
import org.robolectric.Robolectric; 
import org.robolectric.RobolectricTestRunner; 
import org.robolectric.annotation.Config; 


    EsperandroTest {
	

    
	

    

} 

@Config(manifest = Config.NONE)
@RunWith(RobolectricTestRunner.class)
public  class  BasicTest {
	

    @Test
    public void testNotNull() {
        EsperandroSimpleExample preferences = Esperandro.getPreferences(EsperandroSimpleExample.class, Robolectric.application);
        Assert.assertNotNull(preferences);
    }
	

    @Test
    public void testSameObject() {
        EsperandroSimpleExample preferences1 = Esperandro.getPreferences(EsperandroSimpleExample.class, Robolectric.application);
        EsperandroSimpleExample preferences2 = Esperandro.getPreferences(EsperandroSimpleExample.class, Robolectric.application);
        Assert.assertNotNull(preferences1);
        Assert.assertNotNull(preferences2);
        Assert.assertEquals(preferences1, preferences2);
    }

}
