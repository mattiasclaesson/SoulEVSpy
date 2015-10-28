package org.hexpresso.elm327.commands.protocol;

import org.hexpresso.elm327.commands.AbstractCommand;
import org.hexpresso.elm327.commands.enums.OBDProtocols;

/**
 * Created by Pierre-Etienne Messier <pierre.etienne.messier@gmail.com> on 2015-10-26.
 */
public class OBDSetProtocolCommand extends AbstractCommand {

    public OBDSetProtocolCommand(final OBDProtocols protocol) {
        super("AT SP " + protocol.getValue());
    }
}
