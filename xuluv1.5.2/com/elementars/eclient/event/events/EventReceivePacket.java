// 
// Decompiled by Procyon v0.5.36
// 

package com.elementars.eclient.event.events;

import net.minecraft.network.Packet;
import com.elementars.eclient.event.Event;

public class EventReceivePacket extends Event
{
    private Packet packet;
    
    public EventReceivePacket(final Packet packet) {
        this.packet = packet;
    }
    
    public Packet getPacket() {
        return this.packet;
    }
    
    public void setPacket(final Packet packet) {
        this.packet = packet;
    }
}
