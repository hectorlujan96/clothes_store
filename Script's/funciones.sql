--set search_path to tienda_ropa;
--select * from empleado;

create or replace function usuario_existente(in varchar, in varchar)
returns boolean as
$$
begin	
	if exists (select usuario from empleado where contraseña = $2 and usuario = $1) then
		return true;
	else
		return false;
	end if;
end;
$$
language plpgsql;

--select * from usuario_existente('lrigg0', 'qQoXtvY');
