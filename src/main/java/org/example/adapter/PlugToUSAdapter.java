package org.example.adapter;

public class PlugToUSAdapter implements USSocket {
    private final Plug plug;
    private final String regionName;

    public PlugToUSAdapter(Plug plug, String regionName) {
        this.plug = plug;
        this.regionName = regionName;
    }

    @Override
    public void powerUp() {
        plug.connect();
        System.out.println("The " + regionName + " adapter converted the plug to US standard!");
    }
}
